import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum_2 = 0;
        int sum_3 = 0;
        int cnt = 0;
        double avg = 0;

        for(int i=0;i<10;i++){
            int n = sc.nextInt();
            arr[i] = n;
        }
        for(int i=1;i<10;i+=2){
            sum_2 += arr[i];
        }
        System.out.print(sum_2 + " ");
        for(int i=2;i<10;i+=3){
            sum_3 += arr[i];
            cnt++;
        }
        avg = (double)sum_3/cnt;
        System.out.printf("%.1f", avg);
    }
}