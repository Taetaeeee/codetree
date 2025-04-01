import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        double avg = 0;
        int passcnt = 0;

        for(int i=0;i<n;i++){
            sum = 0;
            for(int j=0;j<4;j++){
                int jumsu = sc.nextInt();
                sum+=jumsu;
            }
            avg = (double)sum/4;
            if(avg>=60)
            {
                System.out.println("pass");
                passcnt++;
            }
            else
            {
                System.out.println("fail");
            }
        }
        System.out.print(passcnt);
    }
}