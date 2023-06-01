import java.util.Arrays;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int a[] = {5, 6, 7,8,9,10, 1, 2,3};
        int target = 10;
        System.out.println(search(a, target, 0, a.length - 1));
    }

    private static boolean search(int[] a, int target, int i, int j) {
        if (i > j)
            return false;

        int mid = (i + j) / 2;

        //ele found
        if (a[mid] == target)
            return true;

        // mid on L1
        if (a[i] <= a[mid]) {
            if (a[i] <= target && target < a[mid])
                return search(a, target, i, mid - 1);
            else
                return search(a, target, mid + 1, j);
        }
        // mid on L2
        else {
            if (a[j] >= target && target > a[mid])
                return search(a, target, mid + 1, j);
            else
                return search(a, target, i, mid - 1);
        }
    }
}
