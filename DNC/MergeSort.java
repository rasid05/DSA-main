import java.util.Arrays;

public class MergeSort {
    public static void merge(int a[], int p, int mid, int q) {
        int temp[] = new int[q - p + 1];
        int i = p, j = mid + 1, k = 0;

        while (i <= mid && j <= q) {
            if (a[i] < a[j])
                temp[k++] = a[i++];
            else
                temp[k++] = a[j++];
        }
        while (i <= mid)
            temp[k++] = a[i++];
        while (j <= q)
            temp[k++] = a[j++];

        for (k = 0, i = p; k < temp.length; k++, i++)
            a[i] = temp[k];
    }

    public static void mergeSort(int a[], int p, int q) {
        if (p < q) {
            int mid = (p + q) / 2;
            mergeSort(a, p, mid);
            mergeSort(a, mid + 1, q);
            merge(a, p, mid, q);
        }
    }

    public static void main(String[] args) {
        int a[] = {4, 6, 3, 2, 7, 5, 6, 7, 64, 23, 45, 32, 12, 76, 9};
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
