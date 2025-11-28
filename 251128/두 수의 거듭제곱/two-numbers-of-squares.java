import java.util.Scanner;

public class Main {
    public static int guzz(int a, int b){
        int aa = a;
        for(int i=1;i<b;i++){
            aa*=a;
        }
        return aa;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        System.out.print(guzz(a, b));
    }
}