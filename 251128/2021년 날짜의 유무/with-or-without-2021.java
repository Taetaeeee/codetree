import java.util.Scanner;
public class Main {
    public static int isjudge(int m){
        if(m==2)
            return 28;
        if(m==4||m==6||m==9||m==11)
            return 30;
        
        return 31;
    }
    public static boolean judgeDay(int m, int d){
        if(m<=12 && d<= isjudge(m))
            return true;
        
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.

        if(judgeDay(m, d))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}