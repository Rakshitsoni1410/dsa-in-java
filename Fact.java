public class Fact {
    public static void main(String[] args) {
        int ans = fact(7);
        System.out.println(ans);
    }
    static int fact(int a){
        if(a<=1){
        return 1;
        }
        
    return a * fact(a-1);
    }
}
