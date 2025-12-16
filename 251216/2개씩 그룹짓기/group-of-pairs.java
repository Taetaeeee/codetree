import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static int [] nums;
    public static int num(){
        int max = 0;
        int len = nums.length - 1;

        for(int i=0;i<nums.length;i++){
            int total = nums[i] + nums[len--];
            if(total > max){
                max = total;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(nums);

        System.out.println(num());
    }
}