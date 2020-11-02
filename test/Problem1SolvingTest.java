import Problem1Solving.Problem1Solving;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem1SolvingTest {

    @Test
    public void testProblem1SolvingFunction() {
        int[] arr = {1,2,3,1};
        Assertions.assertEquals(4, Problem1Solving.findSum(arr));

        int[] arr2 = {1,2,3,1,4};
        Assertions.assertEquals(8, Problem1Solving.findSum(arr2));

        int[] arr3 = {1,2,3,4,1};
        Assertions.assertEquals(6, Problem1Solving.findSum(arr3));
    }
}
