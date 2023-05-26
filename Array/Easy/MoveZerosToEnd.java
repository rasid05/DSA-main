// Time Complexity - O(x) + O(n-x) = O(n)

class Solution {
  void pushZerosToEnd(int[] arr, int n) {
    
    //finding first zero occurrence
    int temp = -1;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) {
        temp = i;
        break;
      }
    }

    // If there is no zero in the array
    if (temp == -1) return;

    //finding zeros and immediate non-zero elements and swapping them
    for (int i = temp + 1; i < n; i++) {
      if (arr[i] != 0) {
        int op = arr[temp];
        arr[temp] = arr[i];
        arr[i] = op;
        temp += 1;
      }
    }
  }
}
