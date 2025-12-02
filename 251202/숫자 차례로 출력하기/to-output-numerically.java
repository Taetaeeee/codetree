import java.util.Scanner;
public class Main {
    public static void printNum_up(int n){
        if(n==0){
            return;
        }
        printNum_up(n-1);
        System.out.print(n + " ");
    }
    public static void printNum_down(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        printNum_down(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printNum_up(n);
        System.out.println();
        printNum_down(n);
    }
}