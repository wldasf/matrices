public class Transportation {
    public static int[][] main(int[][] arr) {
        int[][] trans = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++)
            for (int y = 0; y < arr[i].length; y++)
                trans[y][i] = arr[i][y];
        return trans;
    }
}

