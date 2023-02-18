public class Solution {

    public static int[] productExceptSelf(int[] nums) {

        int[] output = new int[nums.length];
        int pre = 1;
        int post = 1;
        output[0] = nums[0];
        output[output.length - 1] = nums[nums.length-1];

        for (int i = 0; i < nums.length; i++) {
            output[i] = pre;
            pre *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) { 

            output[i] *= post;
            post *= nums[i];
        }

        return output;
    }

    public static void main(String[] args) throws Exception {


        int[] nums = {1,2,3,4 };
        int[] sln = Solution.productExceptSelf(nums);

        for (int i = 0; i < sln.length; i++) {
            System.out.print(" " + sln[i]);
        }

        System.out.println();
    }
}
