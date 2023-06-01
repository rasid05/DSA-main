import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int a[], int p, int q) {
        if (p < q) {
            int pivot = pivot(a, p, q);
            quickSort(a, p, pivot - 1);
            quickSort(a, pivot + 1, q);
        }
    }

    private static int pivot(int[] a, int p, int q) {
        int pivot = a[p];
        int temp = p;
        for (int i = p + 1; i <= q; i++)
            if (a[i] < pivot)
                swap(a, i, ++temp);
        swap(a, p, temp);
        return temp;
    }

    private static void swap(int a[], int i, int i1) {
        int temp = a[i];
        a[i] = a[i1];
        a[i1] = temp;
    }

    public static void main(String[] args) {
        int a[] = {4, 6, 3, 2, 7, 5, 6, 7, 64, 23, 45, 32, 12, 76, 9};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
