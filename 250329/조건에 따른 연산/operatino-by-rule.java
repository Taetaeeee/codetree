import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        while(true){
            if(n>=1000)
            {
                System.out.print(cnt);
                break;
            }
            else{
                if(n%2==0){
                    n = n*3 + 1;
                    cnt++;
                }
                else if(n%2==1){
                    n = n*2 + 2;
                    cnt++;
                }
            }
        }
    }
}