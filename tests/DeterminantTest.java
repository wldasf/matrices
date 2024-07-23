import static org.junit.jupiter.api.Assertions.*;

public class DeterminantTest {

    @org.junit.Test
    public void givenValid2x2Matrix_whenCalculateDeterminant_thenExpectedResultIsReturned() {
        double[][] matrix = {
                {1,2},
                {3,4}
        };
        int expectedResult = -2;
        double result = Determinant.determinant2x2(matrix);
        assertEquals(expectedResult, result, "returned result not as expected");
    }

    @org.junit.Test
    public void given3x3Matrix_whenCalculatingTheCoFactor_thenExpectedResultIsReturned() {
        double[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int row = 1;
        int col = 2;
        double[][] expectedResult = {
                {1, 2},
                {7, 8}
        };
        double[][] result = Determinant.cofactor(matrix, row, col);
         assertArrayEquals(expectedResult, result, "returned result not as expected");
    }

    @org.junit.Test
    public void givenNxNMatrix_whenFindingDeterminant_thenExpectedResultIsReturned() {
        double[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int expectedResult = 0;
        double result = Determinant.determinant(matrix);
        assertEquals(expectedResult, result, "returned result not as expected");
    }

}
