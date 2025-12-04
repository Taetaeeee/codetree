import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int n = sc.nextInt();
    public static int[] arr = new int[n];
    public static int cnt = 0;
    public static int max_val = 0;
    public static int F(int[] arr){
        if(cnt == n){
            return max_val;
        }
        if(arr[cnt] > max_val){
            max_val = arr[cnt];
        }
        cnt++;
        return F(arr);
    }
    public static void main(String[] args) {

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        System.out.print(F(arr));
    }
}