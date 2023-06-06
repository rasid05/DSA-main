public class PairSumII {
    public static void main(String[] args) {
        // In a sorted roted array
        int[] nums = {11, 14, 15, 3, 4, 6, 8};
        int target = 8;

        System.out.println(isExist(nums, target));
    }
    private static boolean isExist(int[] nums, int target) {
        int pivot = -1;
        int n = nums.length;
        for (int i = 0; i < n; i++)
            if (nums[i] > nums[i + 1]) {
                pivot = i;
                break;
            }

        int st = pivot + 1, last = pivot;
        while (st != last) {
            int temp = nums[st] + nums[last];
            if (temp == target) {
                return true;
            } else if (temp > target)
                last = (n - 1 + last) % n;
            else
                st = (st + 1) % n;
        }
        return false;
    }
}