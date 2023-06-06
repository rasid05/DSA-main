import java.util.Arrays;

public class PairSum {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6, 7, 2, 3, 5, 67, 8, 43};
        int target = 5;

        System.out.println(isExist(nums, target));
    }

    private static boolean isExist(int[] nums, int target) {
        Arrays.sort(nums);
        int st = 0, last = nums.length - 1;
        while (st < last) {
            int temp = nums[st] + nums[last];
            if (temp == target) {
                return true;
            } else if (temp > target)
                last--;
            else
                st++;
        }
        return false;
    }
}
