import java.util.Scanner;

public class Main {
    public static final int MAX_N = 50;
    public static int n;
    public static int[] arr = new int[MAX_N];
    public static void perfectNum(int[] arr){
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                arr[i] = -arr[i];
            }
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        perfectNum(arr);

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}