import java.util.Scanner;
public class Main {
    public static int cnt = 0;
    public static int F(int n){
        if(n==1){
            return 1;
        }
        if(n%2==0){
            cnt++;
            return F(n/2);
        }
        else{
            cnt++;
            return F(n/3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        F(n);
        System.out.print(cnt);
    }
}