import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        char word = c.charAt(0);
        int n = sc.nextInt();

        if(word == 'A'){
            for(int i=1;i<=n;i++){
                System.out.print(i + " ");
            }
        }
        else if(word == 'D'){
            for(int i=n;i>=1;i--){
                System.out.print(i + " ");
            }
        }
    }
}