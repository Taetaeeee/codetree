import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        while(true){
            int n = sc.nextInt();

            if(n ==0){
                break;
            }

            arr[n/10]++;
        }
        for(int i=1;i<10;i++){
            System.out.println(i + " - " + arr[i]);
        }
    }
}