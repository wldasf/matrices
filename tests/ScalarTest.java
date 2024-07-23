import static org.junit.jupiter.api.Assertions.*;

public class ScalarTest {

    @org.junit.Test
    public void givenTwoValidMatrices_whenScalar_thenExpectedResultIsReturned() {
        int[][] arr = {
                {1,8,-3},
                {4,-2,5}
        };
        int scaler = 2;
        int[][] expectedResult1 = {
                {2,16,-6},
                {8,-4,10}
        };
        int[][] result1 = Scalar.main(arr, scaler);
        assertArrayEquals(expectedResult1, result1, "returned result not as expected");
    }
}
