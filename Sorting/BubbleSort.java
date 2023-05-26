import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        // int a[] = {5,4,3,2,1};
        int a[] = {1, 2, 3, 4, 5};
        int n = a.length;

        // Bubble Sort
        int swap = 0;
        for (int turn = 0; turn < n - 1; turn++) {
            for (int i = 0; i < n - 1 - turn; i++) {
                if (a[i] > a[i + 1]) {
                    int t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                    swap++;
                }

            }
            if (swap == 0) break;
            else swap = 0;
        }

        System.out.println(Arrays.toString(a));
    }
}
