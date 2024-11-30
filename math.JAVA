public   class Math{
 public static void main(String args[])
 {
    int a = 67;
 System.out.println(isOdd(a));
 }
 private static boolean isodd(int a) {
return( a & 1 )==1;
}
}