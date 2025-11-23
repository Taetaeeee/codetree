import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int [] arr = new int[10];

        while(A>1){
            arr[A%B]++;
            A/=B;
        }

        int sum = 0;
        for(int i=0;i<10;i++){
            if(arr[i]!=0)
            {
                sum = sum + arr[i] * arr[i];
            }
        }
        System.out.print(sum);
    }
}