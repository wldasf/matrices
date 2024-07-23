public class Submatrix {
    public static int[][] createSubmatrix(int[][] matrix, int[] rowsToRemove, int[] colsToRemove) {
        int newRowCount = matrix.length - rowsToRemove.length;
        int newColCount = matrix[0].length - colsToRemove.length;
        int[][] miniMatrix = new int[newRowCount][newColCount];

        int newRow = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (isInArray(rowsToRemove, i)) {
                continue;
            }
            int newCol = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (isInArray(colsToRemove, j)) {
                    continue;
                }
                miniMatrix[newRow][newCol] = matrix[i][j];
                newCol++;
            }
            newRow++;
        }

        return miniMatrix;
    }

    private static boolean isInArray(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}
