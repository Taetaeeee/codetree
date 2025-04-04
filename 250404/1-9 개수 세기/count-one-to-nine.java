import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[10];

        for(int i=0;i<n;i++){
            int n1 = sc.nextInt();
            arr[n1]++;
        }
        for(int i=1;i<10;i++){
            System.out.println(arr[i]);
        }
    }
}