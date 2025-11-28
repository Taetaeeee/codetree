import java.util.Scanner;
public class Main {
    public static boolean perfectNum(int n){
        if(n%2!=0 && n%10!=5 && (n%3!=0||n%9==0))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        int A = sc.nextInt();
        int B = sc.nextInt();

        int cnt = 0;
        for(int i=A;i<=B;i++){
            if(perfectNum(i))
                cnt++;
        }
        System.out.print(cnt);
    }
}