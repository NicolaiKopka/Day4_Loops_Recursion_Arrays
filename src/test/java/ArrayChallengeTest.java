import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayChallengeTest {
    
    @Test
    void shouldReturnCorrectStringsFromArray() {
        String[] testArray = {"Student 1", "Student 2", "Student 3", "Student 4", "Student 5"};
        String[] actualArray = ArrayChallenge.createStudentArray(5);
        Assertions.assertArrayEquals(testArray, actualArray);
    }

}