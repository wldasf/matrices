import java.util.Arrays;

public class Scalar {
    public static int[][] main(int[][] arr, int scaler)  {
        int[][] product = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++)
            for (int y = 0; y < arr[i].length; y++)
                product[i][y] = scaler * arr[i][y];
        return product;
    }
}

