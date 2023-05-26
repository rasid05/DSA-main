import java.util.*;
public class Solution {
  public static int RemoveDuplicates(ArrayList < Integer > arr, int n) {
    // Array is sorted------------
    
//     Solution 1
//     Put all element in set because set doesn't allow duplicates
    
//     Set<Integer> st = new HashSet<Integer>();
//     for (int index = 0; index < arr.size(); index++) {
//       st.add(arr.get(index));
//     }
//     return st.size();

    
    // Solution 2
    // Here We use 2 pointer concept 
    // If We get a unique element then we put that in place of ans index 
    // and increase the ans.
    // At the end we return size that is ans+1
    int ans = 0;
    for (int i = 1; i < arr.size(); i++) {
      if (arr.get(ans) != arr.get(i)) {
        arr.set(ans + 1, arr.get(i));
        ans += 1;
      }
    }
    return ans + 1;
  }
}
