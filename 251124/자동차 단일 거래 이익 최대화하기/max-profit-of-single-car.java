import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] arr = new int[N];
        int buycar = -1;

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        int car = 0;
        for(int i=1;i<N;i++){
            if(arr[car]>arr[i])
                car = i;
        }
        if(car==N-1){
            System.out.println("0");
        }
        else{
            int sellcar = car;
            for(int i=car;i<N;i++){
                if(arr[sellcar]<arr[i])
                    sellcar = i;
            }
            System.out.println(arr[sellcar]-arr[car]);
        }
    }
}