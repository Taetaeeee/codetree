import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] cnt = new int[1001];
        int max = -1;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            cnt[arr[i]]++;
        }
        for(int i=0;i<1001;i++){
            if(cnt[i]==1){
                if(i>max){
                    max = i;
                }
            }
        }
        System.out.print(max);
    }
}