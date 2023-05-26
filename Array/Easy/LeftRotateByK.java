// Brute Force 
// We create a temp array of K size and stored values of 1st K element 
// Then we shift other element to the front and put element of temp arrray after that
//
// DRY RUN :
// a[] = {1,2,3,4,5,6}   k=3
// temp[]= {1,2,3}
// Shifting:  for(int i = k; i < n; i++)  arr[i-d] = arr[i];
// Putting: Last 3 place so n-k
//          j=0
//          for(int i = n-k; i < n; i++){  arr[i] = temp[j]; j++}
//
// Time - O(n+k),  Space - O(K)


// Optimal Solution.   Space - O(1)
public class Solution {
    // Function to Reverse the array
    static void reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void leftRotate(int arr[], int n, int d) {
        if (n == 0) return;
        // Get the effective number of rotations:
        d = d % n;
        //step 1:
        reverse(arr, 0, d - 1);
        //step 2:
        reverse(arr, d, n - 1);
        //step 3:
        reverse(arr, 0, n - 1);
    }
