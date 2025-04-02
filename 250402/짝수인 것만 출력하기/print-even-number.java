import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            int n1 = sc.nextInt();
            if(n1%2==0){
                arr[cnt] = n1;
                cnt++;
            }
        }
        for(int i=0;i<cnt;i++){
            System.out.print(arr[i] + " ");
        }
    }
}