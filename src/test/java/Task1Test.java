import org.junit.Assert;
import org.junit.Test;

public class Task1Test {
    MainDz6 metodTask1;

    @Test
    public void testTask1() {
        metodTask1 = new MainDz6();
        int[] assert1 = {5, 6, 7};
        Assert.assertEquals(assert1, metodTask1.task1(1, 2, 3, 4, 5, 6, 7));

    }

    @Test
    public void test() {
        int a = 1;
        Assert.assertEquals(1, a);
    }
}
