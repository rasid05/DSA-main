import java.util.Scanner;

public class Fibbonacci {
    public static int nthfibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        return nthfibonacci(n - 1) + nthfibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(nthfibonacci(n));
    }
}


