import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = 1;

        for(int i=1;i<=b;i++){
            if(i%a==0){
                prod*=i;
            }
        }

        System.out.print(prod);
    }
}