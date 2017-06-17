import java.util.Arrays;

public class MainDz6 {
    private static MainDz6 mainObj = new MainDz6();

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mainObj.task1(4, 4, 4, 4, 5, 6, 7)));
        System.out.println(mainObj.task2(1, 4));
    }


    Integer[] task1(Integer... arr) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) index = i;
        }
        if (index == -1) throw new RuntimeException("В массиве нет четвёрки!");
        Integer[] result = new Integer[(arr.length - index - 1)];

        for (int i = 0; i < arr.length - index - 1; i++) {
            result[i] = arr[index + i + 1];
        }
        return result;
    }


    Boolean task2(Integer... arr) {
        if (!(Arrays.asList(arr).contains(4) && Arrays.asList(arr).contains(1))) return false;

        for (int i : arr) {
            if (i != 4 && i != 1) return false;
        }
        return true;
    }

}