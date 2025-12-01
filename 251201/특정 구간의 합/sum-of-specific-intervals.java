import java.util.Scanner;
public class Main {
    public static int [] arr = new int [100];
    public static int arrsum(int a, int b){
        int sum = 0;
        
        for(int i=a-1;i<b;i++){
            sum+=arr[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            // Please write your code here.
            System.out.println(arrsum(a1, a2));
        }
    }
}