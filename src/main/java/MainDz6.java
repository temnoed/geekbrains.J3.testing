




import java.util.ArrayList;
import java.util.Arrays;

public class MainDz6 {

     static MainDz6 mainObj = new MainDz6();


    public static void main(String[] args) {
        System.out.println(Arrays.toString(mainObj.task1(1, 2, 3, 4, 5, 6, 7)));

    }




     int[] task1(Integer... arr) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        if (!list.contains(4)) throw new RuntimeException("В массиве нет четвёрки!");

        int index = list.indexOf(4);
        int[] result = new int[arr.length - index - 1];

        for (int i = 0; i < arr.length - index - 1; i++) {
            result[i] = arr[index + i + 1];
        }

        return result;
    }


}
