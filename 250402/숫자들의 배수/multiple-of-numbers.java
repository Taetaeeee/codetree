import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int multicnt = 1;
        int five_cnt = 0;

        while(true){
            int multi = n * multicnt;
            System.out.print(multi + " ");
            if(multi%5==0){
                five_cnt++;
            }
            if(five_cnt==2){
                break;
            }
            multicnt++;
        }
    }
}