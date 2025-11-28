import java.util.Scanner;

public class Main {
    public static boolean moon(int n){
        return n%4==0 && (n%100!=0 || n%400 ==0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        // Please write your code here.
        if(moon(y))
            System.out.print(moon(y));
        else
            System.out.print(moon(y));
    }
}