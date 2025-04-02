import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[20];

        arr[0] = 1;
        arr[1] = n;
        int cnt=0;

        for(int i=2;i<20;i++){
            arr[i] = arr[i-1] + arr[i-2];
            if(arr[i]>=100)
            {
                cnt = i;
                break;
            }
        }
        for(int i=0;i<=cnt;i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}