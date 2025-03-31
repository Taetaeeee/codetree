import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double n;
        double sum = 0;
        double avg = 0;

        for(int i=0;i<8;i++){
            n = sc.nextDouble();
            sum+=n;
        }
        avg = sum/8;
        System.out.printf("%.1f", avg);
    }
}