import java.util.Scanner;
public class Main {
    public static int partial(String t, String p){
        for(int i=0;i<=t.length()-p.length();i++){
            int cnt = 0;
            for(int j=0;j<p.length();j++){
                if(t.charAt(i+j)==p.charAt(j)){
                    cnt++;
                }
            }
            if(cnt == p.length())
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        // Please write your code here.

        System.out.print(partial(text, pattern));
    }
}