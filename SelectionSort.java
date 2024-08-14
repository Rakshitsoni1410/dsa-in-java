import java.util.Scanner;

class SelectionSort {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_element = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_element]) {
                    min_element = j;
                }
            }
            int temp = arr[min_element];
            arr[min_element] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        SelectionSort ob = new SelectionSort();
        ob.sort(arr);
        System.out.println("Sorted array:");
        ob.printArray(arr);
        scanner.close();
    }
}