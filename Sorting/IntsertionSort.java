import java.util.*;
class IntsertionSort {
    public static void main(String[] args) {
        int a[] = {5, 4, 3, 1, 2, 1};
        // int a[] = {1, 2, 3, 4, 5};
        int n = a.length;

        // Insertion Sort
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int val = a[i];
            while (j >= 0 && a[j] > val) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = val;
        }

        System.out.println(Arrays.toString(a));
    }
}
