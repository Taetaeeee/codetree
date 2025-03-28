import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n;
        int cnt = 0;

        while(true){
            if(cnt == 3){
                break;
            }
            else{
                n = sc.nextInt();

                if(n%2==0){
                    System.out.println(n/2);
                    cnt++;
                }else
                {

                }
            }

        }
    }
}