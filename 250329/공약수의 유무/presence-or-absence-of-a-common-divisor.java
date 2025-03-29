import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean judge = false;

        for(int i=a;i<=b;i++){
            if(1920%i==0 && 2880%i ==0){
                judge = true;
            }
        }

        if(judge){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }

    }
}