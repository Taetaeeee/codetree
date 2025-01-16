import java.util.Scanner;

public class Main {
    public static void num(int n){
        for(int i=n;i>=1;i--){
            System.out.print(i + " ");
        }
        for(int i=1;i<=n;i++){
            System.out.print(i+ " ");
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        num(n);
    }
}