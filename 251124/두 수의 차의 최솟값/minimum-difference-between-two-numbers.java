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

        int pro_min = 100;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                int min = arr[j] - arr[i];
                if(pro_min>min)
                    pro_min = min;
            }
        }
        System.out.println(pro_min);
    }
}