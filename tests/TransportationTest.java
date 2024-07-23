import static org.junit.jupiter.api.Assertions.*;

public class TransportationTest {

    @org.junit.Test
    public void givenTwoValidMatrices_whenTransport_thenExpectedResultIsReturned() {
        int[][] arr = {
                {1,2,3},
                {0,-6,7}
        };
        int[][] expectedResult1 = {
                {1,0},
                {2,-6},
                {3,7}
        };
        int[][] result1 = Transportation.main(arr);
        assertArrayEquals(expectedResult1, result1, "returned result not as expected");
    }
}
