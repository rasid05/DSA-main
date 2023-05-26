import java.util.*;
public class TappingRainWater {

    public static void main(String[] args) {
        int arr[] = {
            4,
            2,
            0,
            6,
            3,
            2,
            5
        };
        int n = arr.length;

        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < left[i - 1]) {
                left[i] = left[i - 1];
            } else {
                left[i] = arr[i];
            }
        }

        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < right[i + 1]) {
                right[i] = right[i + 1];
            } else {
                right[i] = arr[i];
            }
        }

        int total = 0;
        for (int i = 1; i < n; i++) {
            total += Math.min(left[i], right[i]) - arr[i];
        }
        System.out.print(total);
    }
}
