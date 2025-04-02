import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int[] arr = new int[100];
        
        while(true)
        {
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            arr[cnt] = n;
            cnt++;
        }
        for(int i=0;i<cnt;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]/2 + " ");
            }
            else{
                System.out.print(arr[i] + 3 + " ");
            }
        }
    }
}