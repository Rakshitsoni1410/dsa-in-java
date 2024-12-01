import java.util.Arrays;
class mergeSort { // Class name should start with an uppercase letter
    public static void main(String[] args) {
        // You can add an example array to test the mergeSort method
        int[] arr = {38, 27, 43, 3, 9, 82, 10}; // Example array
        int[] sortedArr = mergeSort(arr); // Call the mergeSort method
        System.out.println(Arrays.toString(sortedArr)); // Print the sorted array
    }

    static int[] mergeSort(int[] arr) { // Changed method name to mergeSort
        if (arr.length == 1) {
            return arr; // Fixed return statement: removed the dot
        }
        int mid = arr.length / 2;

        // Fixed method name and syntax for copying ranges
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length)); // Fixed initialization of right array

        return merge(left, right); // Call the merge method to combine sorted arrays
    }

    static int[] merge(int[] left, int[] right) { // Added merge method
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        // Merging the two arrays
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // Copy remaining elements of left array, if any
        while (i < left.length) {
            result[k++] = left[i++];
        }

        // Copy remaining elements of right array, if any
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result; // Return the merged array
    }
}