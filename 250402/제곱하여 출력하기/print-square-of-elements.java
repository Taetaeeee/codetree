import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            int n2 = sc.nextInt();
            arr[i] = n2 * n2;
            System.out.print(arr[i] + " ");
        }

    }
}