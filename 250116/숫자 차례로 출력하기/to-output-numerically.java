import java.util.Scanner;

public class Main {
    public static void nprint(int n){
        for(int i=1;i<=n;i++){
            System.out.print(i + " ");
        }
        System.out.println("");
        for(int i=n;i>0;i--){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        nprint(n);
    }
}