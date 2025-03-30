import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;

        for(int i=0;i<10;i++){
            n = sc.nextInt();
            sum+=n;
        }
        System.out.print(sum);
    }
}