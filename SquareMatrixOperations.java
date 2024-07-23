public class SquareMatrixOperations {

    public static int[][] makeDiagonal(int[][] matrix) {
        int[][] result = copyMatrix(matrix);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (i != j) {
                    result[i][j] = 0;
                }
            }
        }
        return result;
    }

    public static int[][] makeLowerTriangular(int[][] matrix) {
        int[][] result = copyMatrix(matrix);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (j < i) {
                    result[i][j] = 0;
                }
            }
        }
        return result;
    }

    public static int[][] makeUpperTriangular(int[][] matrix) {
        int[][] result = copyMatrix(matrix);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (j > i) {
                    result[i][j] = 0;
                }
            }
        }
        return result;
    }

    public static int[][] copyMatrix(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[i][j] = matrix[i][j];
            }
        }
        return result;
    }
}
