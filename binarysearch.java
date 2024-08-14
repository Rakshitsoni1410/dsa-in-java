 class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 9, 11, 23, 85, 99};
        int target = 23; // changed the target to 23 which is present in the array
        int ans = binarySearch(arr, target);
        if(ans != -1) {
            System.out.println("Element found at index " + ans);
        } else {
            System.out.println("Element not found in the array");
        }
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}