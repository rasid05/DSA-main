import java.util.*;
public class Solution {
  public static void leftRotate(int[] arr, int n) {
    int key = arr[0];
    for (int i = 1; i < n; i++) {
      arr[i - 1] = arr[i];
    }
    arr[n-1] = key;
  }
}
