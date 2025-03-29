import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pow = 1;
        int cnt = 0;

        while(true){
            for(int i=1;i<=10;i++){
                for(int j=1;j<=i;j++){
                    pow*=2;
                }
                if(n==pow){
                    System.out.print(i);
                    break;
                }
            }
        }
    }
}