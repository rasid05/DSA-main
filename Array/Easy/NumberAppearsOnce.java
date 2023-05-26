// Brute Force : TC - O(N^2)
// First, we will run a loop(say i) to select the elements of the array one by one.
// For every element arr[i], we will perform a linear search using another loop and count its occurrence.
// If for any element the occurrence is 1, we will return it.

// Better Solution(Using Hashing)
// Now, hashing can be done in two different ways and they are the following:

// 1st: Array hashing(not applicable if the array contains negatives or very large numbers)
// TC - O(N)+O(N)+O(N)     SC - O(maxElement+1)
// First, we will find the maximum element(say maxElement) to know the size of the hash array.
// Then we will declare a hash array of size maxElement+1.
// Now, using another loop we will store the elements of the array along with their frequency in the hash array. (i.e. hash[arr[i]]++)
// After that, using another loop we will iterate over the hash array, and try to find the element for which the frequency is 1, and finally, we will return that particular element.

//2nd: Hashing using the map data structure
// TC - O(N*logM) + O(M) where M = size of the map i.e. M = (N/2)+1. N = size of the array.
// SC - O(M)
// First, we will declare a map.
// Now, using a loop we will store the elements of the array along with their frequency in the map data structure.
// Using another loop we will iterate over the map, and try to find the element for which the frequency is 1, and finally, we will return that particular element.
int n = arr.length;
HashMap < Integer, Integer > mpp = new HashMap < > ();
for (int i = 0; i < n; i++) {
  int value = mpp.getOrDefault(arr[i], 0);
  mpp.put(arr[i], value + 1);
}
//Find the single element and return the answer:
for (Map.Entry < Integer, Integer > it: mpp.entrySet()) {
  if (it.getValue() == 1) {
    return it.getKey();
  }
}
//This line will never execute if the array contains a single element.
return -1;


// Optimal Solution : O(N)
public static int getSingleElement(int[] arr) {
  int n = arr.length;
  int xorr = 0;
  for (int i = 0; i < n; i++) {
    xorr = xorr ^ arr[i];
  }
  return xorr;
}
