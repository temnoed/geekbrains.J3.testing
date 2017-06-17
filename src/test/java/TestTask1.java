import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


@RunWith(Parameterized.class)
public class TestTask1 {
    private Integer[] resultMatrix;
    private Integer[] dataMatrix;


    public TestTask1(List<Integer> a, List<Integer> b) {
        this.resultMatrix = (Integer[]) a.toArray();
        this.dataMatrix = (Integer[]) b.toArray();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {Arrays.asList(5, 6, 7), Arrays.asList(1, 2, 3, 4, 5, 6, 7)}, // окей
                {Arrays.asList(5, 6, 7), Arrays.asList(4, 4, 4, 4, 5, 6, 7)}, // окей
                {Arrays.asList(5, 6, 7), Arrays.asList(1, 2, 3, 0, 5, 6, 7)}  // - нет четвёрки!
        };
        return Arrays.asList(data);
    }


    MainDz6 method;

    @Before
    public void startTest() {
        method = new MainDz6();
    }

    @Test
    public void testTask1() {
        Assert.assertArrayEquals(resultMatrix, method.task1(dataMatrix));

    }

    @Test(expected = RuntimeException.class)
    public void testTask1RuntimeE() {
        Integer[] assert1 = {5, 6, 7};
        Assert.assertArrayEquals(assert1, method.task1(0, 0, 0, 0, 5, 6, 7));
    }

}
