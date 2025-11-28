import java.util.Scanner;

public class Main {
    public static int mininum(int a, int b, int c){
        int minval = a;
        
        if(minval>b)
            minval = b;
        if(minval>c)
            minval = c;

        return minval;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        System.out.print(mininum(a, b, c));
    }
}