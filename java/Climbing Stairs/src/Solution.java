public class Solution {

    public int climbStairs(int n) {

        if (n <= 2) return n;
        //para n != 1 ó 2:
        int nmd = 1; //n - 2
        int nmu = 2; //n - 1

        for (int i = 3; i<=n;i++){
            int nmuMnmd = nmd + nmu;
            nmd = nmu;
            nmu = nmuMnmd;
        }
        //Primera solución - exceso de timepo límite
        //int steps = 0;
/* 
        if (n <=3) return n;
        else if (n >= 4){
            int tmp = n-1;
            steps += climbStairs(tmp);
            tmp = n-2;
            steps += climbStairs(tmp);
        }
*/
        return nmu;
    }

    public static void main(String[] args) throws Exception {

        int n = 45;
        Solution sln = new Solution();
        System.out.println(sln.climbStairs(n));
    }
}
