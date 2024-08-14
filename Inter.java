import java.util.Scanner;
class Inter{
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the no ");
        int n = sc .nextInt();
        int [] arr= new int [n];
        System.out.print("enter the element ");
        for(int i =0;i<n; i++){
            arr[i] = sc.nextInt();
        
        }
        Inter(arr);
        System.out.print("sort ");
        for(int i  : arr){
            System.out.print(i + "");
        }

    }
    public static void Inter(int [] arr){
        int n = arr.length;
        for(int i =1;i<n;i++){
            int key = arr[i];
            int j =i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;}

                arr[j+1] =  key;
            
        }
    }
}