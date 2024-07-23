public class Determinant {
        public static double determinant2x2(double[][] matrix) {
                if (matrix.length != 2 || matrix[0].length != 2) {
                        throw new IllegalArgumentException("Matrix must be 2x2");
                }
                return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        public static double[][] cofactor(double[][] matrix, int row, int col) {
                int n = matrix.length;
                double[][] result = new double[n - 1][n - 1];

                for (int i = 0, r = 0; i < n; i++) {
                        if (i != row) {
                                for (int j = 0, c = 0; j < n; j++) {
                                        if (j != col) {
                                                result[r][c++] = matrix[i][j];
                                        }
                                }
                                r++;
                        }
                }
                return result;
        }

        public static double determinant(double[][] matrix) {
                int n = matrix.length;
                if (n == 2) {
                        return determinant2x2(matrix);
                } else {
                        double det = 0;
                        for (int j = 0; j < n; j++) {
                                double sign = Math.pow(-1, j);
                                double[][] cofactorMatrix = cofactor(matrix, 0, j);
                                double cofactorDet = determinant(cofactorMatrix);
                                det += sign * matrix[0][j] * cofactorDet;
                        }
                        return det;
                }
        }
}