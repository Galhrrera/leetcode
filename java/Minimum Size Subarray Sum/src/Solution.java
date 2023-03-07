public class Solution {

    public static int minSubarrayLen(int target, int[] nums) {

        int minLenght = Integer.MAX_VALUE;
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            currentSum += nums[end];
            while (currentSum >= target) {
                minLenght = Math.min(minLenght, end - start + 1);
                currentSum -= nums[start];
                start++;
            }
        }

        if (minLenght == Integer.MAX_VALUE)
            return 0;
        else
            return minLenght;
    }

    public static void main(String[] args) throws Exception {
        int target = 11;
        int[] nums = { 1, 1, 1, 1, 1, 1, 1, 1 };
        System.out.println(minSubarrayLen(target, nums));
    }
}
