import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int n;
        int sum = 0;
        double avg = 0;
        int cnt = 0;

        for(int i=0;i<10;i++){
            n = sc.nextInt();

            if(n>=250){
                break;
            }
            arr[i] = n;
            sum +=n;
            cnt++;
        }
        avg = (double)sum/cnt;
        System.out.printf("%d %.1f", sum, avg);
    }
}