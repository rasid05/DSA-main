import java.util.*;
class CountingSort {
    public static void main(String[] args) {

        // We use counting sort when we know that numbers are positive and their range is low 

        int a[] = {5, 4, 3, 1, 2, 1};
        // int a[] = {1, 2, 3, 4, 5};
        int n = a.length;

        int large = a[0];
        for (int i = 0; i < n; i++) {
            large = Math.max(large, a[i]);
        }
        int count[] = new int[large + 1];
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                a[j] = i;
                j++;
                count[i]--;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
