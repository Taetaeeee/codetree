import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for(int i = n1;i>=n2;i-=2)
        {
            System.out.print(i + " ");
        }
    }
}