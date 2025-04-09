import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int max_num = sc.nextInt();

        for(int i=0;i<9;i++){
            int n = sc.nextInt();
            if(max_num<n){
                max_num = n;
            }
        }

        System.out.print(max_num);
    }
}