import static org.junit.jupiter.api.Assertions.*;

public class SubmatrixTest {

    @org.junit.Test
    public void givenAThreeByFourMatrix_whenRemovingRowThreeAndColumnTwo_thenExpectedResultIsReturned() {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
        };

        int[] rowsToRemove = {2};
        int[] colsToRemove = {1};

        int[][] expectedResult1 = {
                {1,3,4},
                {5,7,8}
        };

        int[][] result1 = Submatrix.createSubmatrix(matrix, rowsToRemove, colsToRemove);

        assertArrayEquals(expectedResult1, result1, "Returned result not as expected");
    }
}
