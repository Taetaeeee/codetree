import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] min_arr = new int[10];
        int[] max_arr = new int[10];

        int max_cnt = 0;
        int min_cnt = 0;
        for(int i=0;i<10;i++){
            int n = sc.nextInt();
            if(n<500){
                max_arr[max_cnt] = n;
                max_cnt++;
            }
            if(n>500){
                min_arr[min_cnt] = n;
                min_cnt++;
            }
        }
        int max = max_arr[0];
        for(int i=1;i<max_cnt;i++){
            if(max_arr[i]>max){
                max = max_arr[i];
            }
        }
        int min = min_arr[0];
        for(int i=1;i<min_cnt;i++){
            if(min_arr[i]<min){
                min = min_arr[i];
            }
        }
        System.out.print(max + " " + min);
    }
}