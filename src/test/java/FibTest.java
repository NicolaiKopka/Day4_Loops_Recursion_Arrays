import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibTest {

    @Test
    void shouldReturn0forFib0() {
        int expectedResult = 0;
        int actualResult = Fib.fib(0);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn1forFib1() {
        int expectedResult = 1;
        int actualResult = Fib.fib(1);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn1forFib2() {
        int expectedResult = 1;
        int actualResult = Fib.fib(2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn8forFib6() {
        int expectedResult = 8;
        int actualResult = Fib.fib(6);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn2forFib3() {
        int expectedResult = 2;
        int actualResult = Fib.fib(3);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn0forFibIterative0() {
        int expectedResult = 0;
        int actualResult = Fib.fibIterative(0);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn1forFibIterative1() {
        int expectedResult = 1;
        int actualResult = Fib.fibIterative(1);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn1forFibIterative2() {
        int expectedResult = 1;
        int actualResult = Fib.fibIterative(2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn8forFibIterative6() {
        int expectedResult = 8;
        int actualResult = Fib.fibIterative(6);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn2forFibIterative3() {
        int expectedResult = 2;
        int actualResult = Fib.fibIterative(3);
        Assertions.assertEquals(expectedResult, actualResult);
    }



}