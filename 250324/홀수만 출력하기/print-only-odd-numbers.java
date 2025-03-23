import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
      Scanner sc = new Scanner(System.in);  
      int num;
        num = sc.nextInt();

        while(sc.hasNextInt()){
            num = sc.nextInt();
            if( (num % 2) != 0 && (num % 3) == 0) {
                System.out.printf("%d\n", num);
            }
        }
    }
}