import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;

        for(int i=0;i<10;i++){
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            if(n%2==0){
                cnt++;
                sum+=n;
            }
        }
        System.out.print(cnt  + " " + sum);
    }
}