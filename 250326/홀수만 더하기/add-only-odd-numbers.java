import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i=0;i<n;i++){
            int n1 = sc.nextInt();
            if(n1%2==1 && n1%3==0){
                sum += n1;
            }
        }

        System.out.print(sum);
    }
}