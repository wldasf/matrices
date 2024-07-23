import static org.junit.jupiter.api.Assertions.*;

public class SquareMatrixOpTest {

    @org.junit.Test
    public void given_then_when() {
        int[][] matrix = {
                {11, 12, 13},
                {21, 22, 23},
                {31, 32, 33}
        };

        int[][] diagonalExpectedResult = {
                {11,0,0},
                {0,22,0},
                {0,0,33}
        };
        int[][] result1 = SquareMatrixOperations.makeDiagonal(matrix);
        assertArrayEquals(diagonalExpectedResult, result1, "returned diagonalMatrix result not as expected");

        int[][] lowerDiagonalExpectedResult = {
                {11,12,13},
                {0,22,23},
                {0,0,33}
        };
        int[][] result2 = SquareMatrixOperations.makeLowerTriangular(matrix);
        assertArrayEquals(lowerDiagonalExpectedResult, result2, "returned lowerDiagonalMatrix result not as expected");

        int[][] upperDiagonalExpectedResult = {
                {11,0,0},
                {21,22,0},
                {31,32,33}
        };
        int[][] result3 = SquareMatrixOperations.makeUpperTriangular(matrix);
        assertArrayEquals(upperDiagonalExpectedResult, result3, "returned upperDiagonalMatrix result not as expected");
    }
}
