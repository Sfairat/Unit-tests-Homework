# Тестами покрыто максимальное количество сценариев, проверены все сценарии поведения приложения для 100% покрытия кода тестами.

import pytest
from _pytest import unittest

from task import Test_list

if __name__ == '__main__':
    unittest.main()


@pytest.fixture
def test_list1():
    return [1, 2, 3, 4, 5]


@pytest.fixture
def test_list2():
    return [2, 3, 4, 5, 6]


def test_init(test_list1, test_list2):
    test_list = Test_list(test_list1, test_list2)
    assert test_list.list1 == test_list1
    assert test_list.list2 == test_list2


def test_average(test_list1, test_list2):
    test_list = Test_list(test_list1, test_list2)
    assert test_list.average() == (3, 4)


@pytest.mark.parametrize('test_list1, test_list2, result',
                         [([1, 2, 3], [], (2, 0)), ([], [1, 2, 3], (0, 2)), ([], [], (0, 0))])
def test_empty_list_average(test_list1, test_list2, result):
    test_list = Test_list(test_list1, test_list2)
    assert test_list.average() == result


@pytest.mark.parametrize('test_list1, test_list2, result',
                         [([1, 2, 3], [1], (2, 1)), ([1], [1, 2, 3], (1, 2)), ([1], [1], (1, 1))])
def test_one_element_list_average(test_list1, test_list2, result):
    test_list = Test_list(test_list1, test_list2)
    assert test_list.average() == result


@pytest.mark.parametrize('test_list1, test_list2', [([2, 3, 4], [1, 2, 3])])
def test_first_list(test_list1, test_list2, capfd):
    test_list = Test_list(test_list1, test_list2)
    test_list.comparison()
    captured = capfd.readouterr()
    assert captured.out.strip() == 'Первый список имеет большее среднее значение'


@pytest.mark.parametrize('test_list1, test_list2', [([1, 2, 3], [2, 3, 4])])
def test_second_list(test_list1, test_list2, capfd):
    test_list = Test_list(test_list1, test_list2)
    test_list.comparison()
    captured = capfd.readouterr()
    assert captured.out.strip() == 'Второй список имеет большее среднее значение'


@pytest.mark.parametrize('test_list1, test_list2', [([1, 2, 3], [1, 2, 3])])
def test_equals(test_list1, test_list2, capfd):
    test_list = Test_list(test_list1, test_list2)
    test_list.comparison()
    captured = capfd.readouterr()
    assert captured.out.strip() == 'Средние значения равны'
