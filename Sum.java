import java.util.Arrays;

public class Sum {
    public static int[][] main(int[][] left, int[][] right) {
        int[][] sum = new int[left.length][left[0].length];
        for (int i = 0; i < left.length; i++)
           for (int y = 0; y < left[i].length; y++)
                sum[i][y] = left[i][y] + right[i][y];
        return sum;
    }
}