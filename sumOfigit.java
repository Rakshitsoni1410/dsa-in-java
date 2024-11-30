public class sumOfigit {
    public static void main(String[] args) {
        int ans = sumOfDigit(1345);
        System.out.print(ans);
    }

    static int sumOfDigit(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigit(n / 10);
    }
}