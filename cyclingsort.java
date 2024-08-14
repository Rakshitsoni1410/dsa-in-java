import java.util.*;
class CyclingSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 5};
        sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("Input array is null");
        }

        for (int num : arr) {
            if (num <= 0) {
                throw new IllegalArgumentException("Input array contains non-positive integers");
            }
        }

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}