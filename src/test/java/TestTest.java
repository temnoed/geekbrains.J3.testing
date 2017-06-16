import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTest {
    MainDz6 metod;

    @Before
    public void startTest() {
        metod = new MainDz6();
    }

    @Test
    public void testTask1() {
        int[] assert1 = {5, 6, 7};
        int[] assert2 = {};
        Assert.assertArrayEquals(metod.task1(1, 2, 3, 4, 5, 6, 7), assert1);
        Assert.assertArrayEquals(metod.task1(4, 4, 4, 4, 5, 6, 7), assert1);
        Assert.assertArrayEquals(metod.task1(0, 0, 0, 4), assert2);
    }

    @Test(expected = RuntimeException.class)
    public void testTask1RuntimeE() {
        int[] assert1 = {5, 6, 7};
        Assert.assertArrayEquals(metod.task1(0, 0, 0, 0, 5, 6, 7), assert1);
    }

    @Test
    public void testTask2() {
        Assert.assertEquals(metod.task2(1, 4), true);
        Assert.assertEquals(metod.task2(), false);
        Assert.assertEquals(metod.task2(1, 3), false);
        Assert.assertEquals(metod.task2(1, 1), false);
    }

}
