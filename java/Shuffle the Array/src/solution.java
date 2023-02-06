
public class solution {
    public int[] shuffle(int[] nums, int n) {
        int sol[] = new int[n * 2];
        int p1 = 0;
        int p2 = n;
        for (int i = 0; i < 2*n; i++){
            if (i%2 == 0){
                sol[i] = nums[p1];
                p1++;
            }
            else{
                sol[i] = nums[p2];
                p2++;
            }
        }
        return sol;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1 };
        int n = 4;

        solution sl = new solution();
        int[] sol = sl.shuffle(nums, n);
        // System.out.println(sl.shuffle(nums, n));

        for (int i = 0; i < 2 * n; i++) {
            System.out.print(sol[i] + "|");
        }
    }
}
