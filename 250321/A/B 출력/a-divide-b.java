import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.print(n1 / n2 + ".");

        int na = (n1 % n2) * 10;
        
        for (int i = 0; i < 20; i++) {
            System.out.print(na / n2);
            na = (na % n2) * 10;
        }

    }
}