// Brute Force - O(N^2)
// 2 for loop required
for (int i = 1; i <= N; i++) {
  // flag variable to check if an element exists
  int flag = 0;
  //Search the element using linear search:
  for (int j = 0; j < N - 1; j++) {
    if (a[j] == i) {
      // i is present in the array:
      flag = 1;
      break;
    }
  }
  // check if the element is missing i.e flag == 0:
  if (flag == 0) return i;
  
  
  // Better Apporach - 
  // We can create a temp array and itreate through original array to mark in temp
  // Again we iterate through temp array to get our result
  // TC : O(N+N)   SC : O(N)
  
  
  // Optimal Solution : O(N)  O(1)
  class Solution {
  public int missingNumber(int[] A) {
    int N = A.length;
    // Sum of available numbers
    int sum = 0;
    for (int i = 0; i < N; i++) {
      sum += A[i];
    }
    // Actual Sum
    int actSum = ((N * (N + 1)) / 2);

    return actSum - sum;
  }
}
// There is only one issue with this solution. (OVERFLOW)
// If N is so big like 10^5 then actSum become 10^10 which can't be stored in int
  
// Best Optimal Sol
int xor1 = 0, xor2 = 0;

for (int i = 0; i < N - 1; i++) {
  xor2 = xor2 ^ a[i]; // XOR of array elements
  xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
}
xor1 = xor1 ^ N; //XOR up to [1...N]

return (xor1 ^ xor2); // the missing number
