// Check from 1 index if current index is less than prev index then not sorted
class CheckIfSorted {
  boolean arraySortedOrNot(int[] arr, int n) {
    for (int i = 1; i < n; i++) {
      if (arr[i] < arr[i - 1])
        return false;
    }
    return true;
  }
}
