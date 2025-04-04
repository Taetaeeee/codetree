import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [] arr = new int [10];
        int sum = 0;
        int temp = 0;

        while(true){
            temp = a%b;
            a = a/b;
            arr[temp]++;

            if(a ==0){
                break;
            }
        }

        for(int i=0;i<10;i++){
            sum = sum + arr[i] * arr[i];
        }
        System.out.print(sum);
    }
}