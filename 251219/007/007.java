import java.util.Scanner;
class Code{
    String sCode;
    char mPoint;
    int time;

    public Code(String sCode, char mPoint, int time){
        this.sCode = sCode;
        this.mPoint = mPoint;
        this.time = time;
        System.out.println("secret code : " + sCode);
        System.out.println("meeting point : " + mPoint);
        System.out.println("time : " + time);
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.

        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();

        Code code1 = new Code(sCode, mPoint, time);
    }

}
