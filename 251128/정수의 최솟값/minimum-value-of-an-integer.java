import java.util.Scanner;

public class Main {
    public static int mininum(int a, int b, int c){
        int min;
        
        if(a>b && b<c)
            min = b;
        if(a>c && c<b)
            min = c;
        if(b>a && a<c)
            min = a;

        return min;
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