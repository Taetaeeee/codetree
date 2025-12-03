import java.util.Scanner;

public class Main {
    public static int F(int n){
        if(n==0)
        {
            return 1;
        }
        return n * F(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(F(n));
    }
}