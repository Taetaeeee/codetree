import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        int pred_max_idx = N;
        
        while(true){
            int max_idx = 0;

            for(int i=1;i<pred_max_idx;i++){
                if(arr[i]>arr[max_idx])
                    max_idx = i;
            }
            System.out.print(max_idx+1," ");

            if(max_idx == 0)
                break;

            pred_max_idx = max_idx;
        }
}