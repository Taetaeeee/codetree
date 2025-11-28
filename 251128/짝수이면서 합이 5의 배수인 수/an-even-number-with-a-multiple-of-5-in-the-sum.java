import java.util.Scanner;
public class Main {
    public static boolean isNum(int n){
        return n%2==0 && ((n/10)+(n%10))%5==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        
        if(isNum(n))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}