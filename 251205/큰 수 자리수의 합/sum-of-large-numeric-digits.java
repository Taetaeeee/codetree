import java.util.Scanner;
public class Main {
    public static int Ncom(int a, int b, int c){
        int aum = a * b * c;

        return Nsum(aum);
    }
    public static int Nsum(int n){
        if(n<10)
            return n;

        int reminder = n % 10;
        return Nsum(n/10) + reminder;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        System.out.print(Ncom(a, b, c));
    }
}