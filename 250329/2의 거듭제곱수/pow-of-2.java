import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pow = 1;
        int cnt = 0;

            for(int i=1;i<=10;i++){
                if(n%2==1 || n==0){
                    break;
                }
                if(n%2==0){
                    n/=2;
                    cnt++;
                }
            }
        System.out.print(cnt);
    }
}