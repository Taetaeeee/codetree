import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int [] arr = new int[100];

        for(int i=0;i<100;i++){
            int n = sc.nextInt();
            arr[i] = n;
        }

        int sum = 0;
        for(int i=0;i<100;i++)
        {
            if(arr[i]==0){
                cnt = i;
                break;
            }
        }
        sum = arr[cnt-1] + arr[cnt-2] + arr[cnt-3];
        System.out.print(sum);
        
    }

}