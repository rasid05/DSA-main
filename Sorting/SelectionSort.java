import java.util.Arrays;

class SelectionSort {
    public static void main(String[] args) {
        int a[] = {5, 4, 3, 2, 1};
        // int a[] = {1, 2, 3, 4, 5};
        int n = a.length;

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (a[mini] > a[j]) {
                    mini = j;
                }
            }
            int t = a[i];
            a[i] = a[mini];
            a[mini] = t;
        }

        System.out.println(Arrays.toString(a));

    }
}
