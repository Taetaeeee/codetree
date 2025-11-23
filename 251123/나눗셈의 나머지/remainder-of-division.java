import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int [] arr = new int[10];

        while(true){
            arr[A%B]++;
            A/=B;
            if(A==0)
                break;
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