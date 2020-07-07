import java.util.Arrays;

public class ArrayFour {
    public static int[] arrayAfterFour(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == 4) {
                return Arrays.copyOfRange(arr, i + 1, arr.length);
            }
        }
        throw new RuntimeException("В исходном массиве не обнаружено ни одной 4");
    }

    public static boolean isArrWithOneFour(int[] arr) {
        boolean a = false, b = false;

        for (int value : arr) {
            if (value != 1 && value != 4){
                return false;
            }
            a |= value == 1;
            b |= value == 4;
        }
        return a && b;
    }
}
