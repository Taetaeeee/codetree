import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];

        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();

        for(int i=2;i<10;i++){
            int n = arr[i-1] + arr[i-2];
            if(n>=10){
                arr[i] = n%10;
            }
            else
            {
                arr[i] = n;
            }
            
        }
        for(int i=0;i<10;i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}