public class Solution {

    public static int maxSubArray(int[] nums) {

        if (nums.length == 1)
            return nums[0];

        int maxSum = nums[0];
        int currentSum = 0;

        for (int n : nums) {
            if (currentSum < 0) {
                currentSum = 0;
            }

            currentSum += n;
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) throws Exception {

        int[] nums = { 5, 4, -1, 7, 8 };
        System.out.println(Solution.maxSubArray(nums));
    }
}
