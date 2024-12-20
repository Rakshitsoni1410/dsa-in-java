import java.util.*;

public class quick {
    public static void main(String[] args) {
        int[] arr = {1, 12, 34, 4, 5, 6};
        sort(arr, 0, arr.length - 1); // Corrected method call
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }
            if (s <= e) {
                // Swap elements
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        // Now pivot is in its correct position
        // Recursively sort the two halves
        sort(nums, low, e); // Corrected to use e
        sort(nums, s, high); // Corrected to use s
    }
}