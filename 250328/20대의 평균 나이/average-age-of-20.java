import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a;
        int sum = 0;
        int cnt = 0;

        while(true){
            a = sc.nextInt();

            if(a>=30){
                System.out.printf("%.2f", (double)sum/cnt);
                break;
            }

            sum +=a;
            cnt++;
        }
    }
}