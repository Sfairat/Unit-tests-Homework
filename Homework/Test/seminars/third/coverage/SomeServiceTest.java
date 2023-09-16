package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {

    private SomeService someService;

    @BeforeEach
    void setUp() {
        someService = new SomeService();
    }
    @Test
    void evenNumberTest(){
        assertTrue(someService.evenOddNumber(2));
    }
    @Test
    void oddNumberTest(){
        assertFalse(someService.evenOddNumber(1));
    }

    @Test
    void lowBorderTest(){
        assertTrue(someService.numberInInterval(25));
    }
    @Test
    void highBorderTest(){
        assertTrue(someService.numberInInterval(100));
    }
    @Test
    void middleTest(){
        assertTrue(someService.numberInInterval(50));
    }
    @Test
    void lowNumberTest(){
        assertFalse(someService.numberInInterval(24));
    }
    @Test
    void highNumberTest(){
        assertFalse(someService.numberInInterval(101));
    }
}