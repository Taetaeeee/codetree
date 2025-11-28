import java.util.Scanner;
public class Main {
    public static boolean judge(int n){
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        if(((n/10) + (n%10))%2==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        
        for(int i=a;i<=b;i++){
            if(judge(i))
                cnt++;
        }
        System.out.print(cnt);
    }
}