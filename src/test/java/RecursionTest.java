import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {

    @Test
    void shouldReturnSumOfIntArray () {
        int[] numberArray = {1, 2, 3, 4};
        int actualResult = Recursion.sumRecursion(numberArray, 0);
        Assertions.assertEquals(10, actualResult);
    }

    @Test
    void shouldReturnSumOfIntArray2 () {
        int[] numberArray = {1, 2, 3, 4, 5};
        int actualResult = Recursion.sumRecursion(numberArray, 0);
        Assertions.assertEquals(15, actualResult);
    }

    @Test
    void shouldReturn1ifInput0() {
        int numberToTest = 0;
        int actualResult = Recursion.faculty(numberToTest);
        assertEquals(1, actualResult);
    }

    @Test
    void shouldReturn1ifInput1() {
        int numberToTest = 1;
        int actualResult = Recursion.faculty(numberToTest);
        Assertions.assertEquals(1, actualResult);
    }

    @Test
    void shouldReturn2ifInput2() {
        int numberToTest = 2;
        int actualResult = Recursion.faculty(numberToTest);
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    void shouldReturn720ifInput6() {
        int numberToTest = 6;
        int actualResult = Recursion.faculty(numberToTest);
        Assertions.assertEquals(720, actualResult);
    }

}