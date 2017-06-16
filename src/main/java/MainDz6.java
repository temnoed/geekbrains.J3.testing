import java.util.ArrayList;
import java.util.Arrays;

public class MainDz6 {
    static MainDz6 mainObj = new MainDz6();

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mainObj.task1(4, 4, 4, 4, 5, 6, 7)));
        System.out.println(mainObj.task2(4, 4, 4, 4, 1));
    }


    int[] task1(int... arr) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) index = i;
        }
        if (index == -1) throw new RuntimeException("В массиве нет четвёрки!");
        int[] result = new int[arr.length - index - 1];

        for (int i = 0; i < arr.length - index - 1; i++) {
            result[i] = arr[index + i + 1];
        }
        return result;
    }


    boolean task2(Integer... arr) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        if (!(list.contains(4) && list.contains(1))) return false;

        for (int i : arr) {
            if (i != 4 && i != 1) return false;
        }
        return true;
    }

}