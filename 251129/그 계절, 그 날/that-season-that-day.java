import java.util.Scanner;
public class Main {
    public static int isjudge(int y, int m){

        if(y%4==0 && (y%100!=0|| (y%100==0&&y%400==0))){
            if(m==2){
                return 29;
            }
            if(m==4||m==6||m==9||m==11){
                return 30;
            }
            
            return 31;
        }
        else{
            if(m==2){
                return 28;
            }
            if(m==4||m==6||m==9||m==11){
                return 30;
            }
            
            return 31;
        }
    }
    public static boolean judgeDay(int y, int m, int d){
        if(m<=12 && d<= isjudge(y, m)){
            return true;
        }
        
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        if(judgeDay(y, m, d)){
            if(m>=3 && m<=5)
                System.out.print("Spring");
            else if(m>=6&&m<=8)
                System.out.print("Summer");
            else if(m>=9&&m<=11)
                System.out.print("Fall");
            else
                System.out.print("Winter");
        }
        else
            System.out.print("-1");
    }
}