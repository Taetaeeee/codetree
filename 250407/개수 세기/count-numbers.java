import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;

        for(int i=0;i<n;i++){
            int n1 = sc.nextInt();
            if(n1==m){
                cnt++;
            }
        }

        System.out.print(cnt);

    }
}