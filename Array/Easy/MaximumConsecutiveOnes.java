public static int consecutiveOnes(int n, int[] arr) {
  int ans = 0, cnt = 0;
  for (int i = 0; i < n; i++) {
    if (arr[i] == 1) {
      cnt++;
      ans = Math.max(ans, cnt);
    } else {
      cnt = 0;
    }
  }
  return ans;
}
