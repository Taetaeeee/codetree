import java.util.Scanner;
public class Main {
    public static boolean issame(String s){
        int len = s.length();

        boolean istrue = true;
        for(int i=0;i<len;i++){
            if(s.charAt(i)==s.charAt(len-i-1)){

            }
            else{
                istrue=false;
            }
        }

        return istrue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        if(issame(input))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}