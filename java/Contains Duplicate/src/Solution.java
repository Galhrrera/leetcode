import java.util.HashSet;

public class Solution {

    public static boolean containsDuplicate(int[] nums) {
        //int act = nums[0];
        //int tmp = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        boolean NocontainsDuplicate = false;

        for (int i = 0; i <nums.length;i++){
            NocontainsDuplicate = hashSet.add(nums[i]);
            if (NocontainsDuplicate == false) return true;
        }
        return false;
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] nums = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(Solution.containsDuplicate(nums));
    }
}
