import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int w;
        int h;
        char s;

        while(true){
            w = sc.nextInt();
            h = sc.nextInt();
            s = sc.next().charAt(0);
            System.out.println(w*h);

            if(s == 'C')
            {
                break;
            }
        }
    }
}