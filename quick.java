public class quick {
    public static void main(String[] args) {
        
    }
    static  void sort(int []nums,int low ,int high) {
        if (low >=high) {
            return;
        }
        int  s =low;
        int e =high;
        int m = s+(e-s)/2;
        int pivot = nums[m];
        while (s<=e ) {
            while (nums[s]<pivot) {
                s++;
            }
            while (nums[e]>pivot) {
                e--;
            }
            if (s <=e) {
                
            }
        }
    }}
