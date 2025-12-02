import java.util.Scanner;
public class Main {
    public static void printstar_down(int n){
        if(n==0){
            return;
        }

        for(int i=0;i<n;i++){
            System.out.print("*" + " ");
        }
        System.out.println();
        printstar_down(n-1);
        
    }
    public static void printstar_up(int n){
        if(n==0){
            return;
        }

        printstar_up(n-1);
        for(int i=0;i<n;i++){
            System.out.print("*" + " ");
        }
        System.out.println();

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printstar_down(n);
        printstar_up(n);
    }
}