import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;


@RunWith(Parameterized.class)
public class TestTask2 {
    private Boolean result; // результаты
    private Integer[] matrix; // матрицы исходных данных

    public TestTask2(Boolean a, List<Integer> b) {
        this.result = a;
        this.matrix = (Integer[])b.toArray();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {true, Arrays.asList(1, 4)},
                {false, Arrays.asList(1, 4)}, // например этот тест не пройден
                {false, Arrays.asList(1, 3)},
                {false, Arrays.asList(1, 1)},
        };
        return Arrays.asList(data);
    }


    private MainDz6 method;

    @Before
    public void startTest() {
        method = new MainDz6();
    }


    @Test
    public void massTestTask2() {
        Assert.assertEquals(result, method.task2(matrix));
    }

}
