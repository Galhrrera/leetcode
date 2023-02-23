public class Solution {

    public static int getSum(int a, int b) {
        return Math.addExact(a, b);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int a = 1, b = 2;

        System.out.println(Solution.getSum(a, b));
    }
}
