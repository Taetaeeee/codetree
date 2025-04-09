import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min_num = 0;
        int min_cnt = 0;

        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(min_num>=arr[i]){
                min_num = arr[i];
            }
        }

        for(int i=0;i<n;i++){
            if(arr[i]==min_num){
                min_cnt++;
            }
        }

        System.out.print(min_num + " " + min_cnt);

    }
}