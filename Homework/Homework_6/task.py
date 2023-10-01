class Test_list:
    def __init__(self, list1: list[int], list2: list[int]):
        self.list1 = list1
        self.list2 = list2

    def average(self):
        average1 = 0
        if self.list1:
            average1 = sum(self.list1) / len(self.list1)

        average2 = 0
        if self.list2:
            average2 = sum(self.list2) / len(self.list2)

        return average1, average2

    def comparison(self):
        average1, average2 = self.average()
        if average1 > average2:
            print('Первый список имеет большее среднее значение')
        elif average1 < average2:
            print('Второй список имеет большее среднее значение')
        else:
            print('Средние значения равны')
            