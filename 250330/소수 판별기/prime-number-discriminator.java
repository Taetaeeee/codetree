import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean judge = false;

        for(int i = 2; i<n;i++){
            if(n%i==0){
                judge = true;
            }
        }
        if(judge){
            System.out.print("C");
        }
        else{
            System.out.print("P");
        }
    }
}