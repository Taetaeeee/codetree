import java.util.Scanner;
public class Main {
    public static boolean threegame(int n){
        return three(n) || (n%3==0);
    }
    public static boolean three(int n){
        while(n>0){
            if(n%10 ==3 || n%10 ==6 || n%10 == 9)
                return true;
            n /=10;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        
        int cnt =0;
        for(int i=A;i<=B;i++){
            if(threegame(i))
                cnt++;
        }
        System.out.print(cnt);
    }
}