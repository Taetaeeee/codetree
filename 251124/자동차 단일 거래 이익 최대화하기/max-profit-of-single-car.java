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

        int car = 0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                int profit = arr[j] - arr[i];
                if(profit>car)
                    car = profit;
            }
        }
        System.out.println(car);
    }
}