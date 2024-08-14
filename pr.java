import java.util.ArrayList;
import java.util.List;

public class pr {
    public static void main(String[] args) {
        System.out.println("hi");
    }
    
        public int[] findErrorNums(int[] arr) {
              
      
        int i = 0; // initialize the variable i
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }
            } else {
                i++; // increment i when arr[i] is in the correct position
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] != idx + 1) {
                return  new int[]{arr[idx],idx+1}; // add the missing number to the result list
            }
        }
         return new  int[]{-1,-1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}