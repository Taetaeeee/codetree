import java.util.Scanner;
public class Main {
    public static int [] arr = new int[2];
    public static void changeNum(int a, int b){
        if(a>b){
            a *=2;
            b +=10;
        }
        else
        {
            a +=10;
            b *=2;
        }
        arr[0] = a;
        arr[1] = b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        changeNum(a, b);
        
        for(int i=0;i<2;i++){
            System.out.print(arr[i] + " ");
        }
    }
}