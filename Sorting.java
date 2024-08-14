import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] arr = { 1,7,5, 2 };
        selection(arr);
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int minIndex = getMinIndex(arr, 0, last);
            swap(arr , last, minIndex);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMinIndex(int[] arr, int start, int end) {
        int min = start;
        for (int i = start; i < end; i++) {
            if (arr[min] > arr[i]) {
                min = i;
            }
        }
        return min;
    }

    static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}