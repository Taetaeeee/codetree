import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n;
        boolean judge = false;

        for(int i=0;i<5;i++){
            n = sc.nextInt();
            if(n%3==1){
                judge = true;
            }
        }

        if(judge){
            System.out.print("0");
        }
        else{
            System.out.print("1");
        }
    }
}