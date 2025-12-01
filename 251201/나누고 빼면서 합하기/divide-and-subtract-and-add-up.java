import java.util.Scanner;
public class Main {
    public static int changeNum(int c){
        if(c%2!=0)
            c-=1;
        else
            c/=2;

        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int sum = 0;
        while(m!=0){
            sum+=arr[m];
            m = changeNum(m);
        }
        System.out.print(sum);
        
    }
}