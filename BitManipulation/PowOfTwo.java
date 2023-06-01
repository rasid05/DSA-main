public class PowOfTwo {
    public static boolean isPowerOfTwo(int n) {
        //        if((n & (n-1)) == 0)
        //            return true;
        //        return false;
        return (n & (n - 1)) == 0 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(6));
    }
}
