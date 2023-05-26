// Here, We should second largest and second smallest element

import java.util.Arrays;
public class Solution {
  public static int[] getSecondOrderElements(int n, int[] a) {

    // Solution 1
    // Arrays.sort(a);
    // int []ans = new int[2];
    // ans[0] = a[a.length-2];
    // ans[1] = a[1];

    
    // Solution 2
    // We need 2 variable here. 
    // During iteration if we find large ele than l1 then that l1 become second large 
    // If ele is smaller than l1 then we need to check if it is second large or not
    
    int l1 = a[0], l2 = Integer.MIN_VALUE;
    for (int i = 1; i < a.length; i++) {
      if (a[i] > l1) {
        l2 = l1;
        l1 = a[i];
      } else if (a[i] > l2) {
        l2 = a[i];
      }
    }

    
    // Similar apporach for second small
    int s1 = a[0], s2 = Integer.MAX_VALUE;
    for (int i = 1; i < a.length; i++) {
      if (a[i] < s1) {
        s2 = s1;
        s1 = a[i];
      } else if (a[i] < s2) {
        s2 = a[i];
      }
    }
    int[] ans = new int[2];
    ans[0] = l2;
    ans[1] = s2;

    return ans;

  }
}
