public class MatMul {


    public static int[][] main(int[][] arrA, int[][] arrB) {
        int[][] arrC = new int[arrA.length][arrB[0].length];

        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrB[0].length; j++) {
                for (int k = 0; k < arrA[0].length; k++) {
                    arrC[i][j] += arrA[i][k] * arrB[k][j];
                }
            }
        }
        return arrC;
    }
}
