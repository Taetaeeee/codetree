import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0;i<n;i++)
        {
            int n1 = sc.nextInt();
            arr[i] = n1;
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]%2==0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}