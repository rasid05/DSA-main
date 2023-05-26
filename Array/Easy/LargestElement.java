class Compute {
  
  public int largest(int arr[], int n) {
    int ans = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (ans < arr[i]) {
        ans = arr[i];
      }
    }
    return ans;
  }
}
