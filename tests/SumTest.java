import static org.junit.jupiter.api.Assertions.*;

public class SumTest {

    @org.junit.Test
    public void givenTwoValidMatrices_whenSum_thenExpectedResultIsReturned() {
        int[][] left1 = {
                {1,3,1},
                {1,0,0}
        };
        int[][] right1 = {
                {0,0,5},
                {7,5,0}
        };
        int[][] expectedSum1 = {
                {1,3,6},
                {8,5,0}
        };
        int[][] result1 = Sum.main(left1, right1);
        assertArrayEquals(expectedSum1, result1, "returned result not as expected");
    }
}
