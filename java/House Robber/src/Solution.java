public class Solution {

    public static int rob(int[] nums) {
        int rob1 = 0, rob2 = 0;


        for (int i = 0; i < nums.length; i++){
            int tempRob = Math.max(rob1 + nums[i], rob2);
            rob1 = rob2;
            rob2 = tempRob;

        }

        return rob2;
    }

    public static void main(String[] args) throws Exception {
        int[] houses = { 1,2,3,1 };
        System.out.println(Solution.rob(houses));
    }
}
