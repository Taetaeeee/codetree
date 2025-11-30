import java.util.Scanner;

public class Main {
    public static int perfectNum(int n){
        if(n<0)
        {
            n*=(-1);
        }

        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        for(int i=0;i<n;i++){
            arr[i] = perfectNum(arr[i]);
            System.out.print(arr[i] + " ");
        }
    }
}