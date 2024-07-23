import static org.junit.jupiter.api.Assertions.*;

public class MatMulTest {

    @org.junit.Test
    public void givenTwoMatchingMatrices_whenMultiplication_thenExpectedResultIsReturned() {
        int[][] arrA = {
                {1,5},
                {2,8},
                {3,7},
                {4,8}
        };

        int[][] arrB = {
                {1,2,3},
                {5,8,7}
        };

        int[][] expectedResult1 = {
                {26,42,38},
                {42,68,62},
                {38,62,58},
                {44,72,68}
        };

        int[][] result1 = MatMul.main(arrA, arrB);
        assertArrayEquals(expectedResult1, result1, "Returned result not as expected");

    }
}
