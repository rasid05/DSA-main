import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
//        int x = 10, n = 18;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(),n=sc.nextInt();
        System.out.println(power(x, n));
    }
    private static long power(int x, int n) {
        if (n == 1)
            return x;
        long temp = power(x, n / 2);
        if (n % 2 == 0)
            return temp * temp;
        return temp * temp * x;
    }
}
