import java.util.Scanner;
public class Main {
    public static void makeractangle(int n){
        int Num = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(Num + " ");
                Num++;
                if(Num>9)
                    Num = 1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        makeractangle(n);
    }
}