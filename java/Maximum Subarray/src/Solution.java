public class Solution {

    public static int maxSubArray(int[] nums) {

        if (nums.length == 1)
            return nums[0];


        int pos = 1;
        int current = 0;
        int[] sums = new int[nums.length];
        int sum = 0;

        while (true) {
            if (pos != current) {
                sum += nums[pos];
                pos++;

            }

            if (pos == nums.length) {
                sums[current] = sum;
                current++;
                sum = 0;
                pos = 0;
                if (current == nums.length - 1 && pos == nums.length - 2) {
                    break;
                }
            }

        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sums.length; i++) {
            if (max < sums[i])
                max = sums[i];
        }

        return max;
    }

    public static void main(String[] args) throws Exception {

        int[] nums = { 5, 4, -1, 7, 8 };
        System.out.println(Solution.maxSubArray(nums));
        System.out.println(":)");
    }
}
