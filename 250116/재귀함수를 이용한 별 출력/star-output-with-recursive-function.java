import java.util.Scanner;

public class Main {
    public static void star(int n){
        int num = 0;
        while(num!=n)
        {
            for(int i=0;i<=num;i++){
                System.out.print("*");
            }
            System.out.println("");

            num+=1;
        }
    }
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        star(n);
    }
}