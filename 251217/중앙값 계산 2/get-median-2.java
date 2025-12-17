import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int [] arr1 = new int[100];
    public static void sortint(int i){
        Arrays.sort(arr1, 0, i);
        int n = i/2;

        System.out.print(arr1[n] + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Please write your code here.
        arr1[0] = arr[0];
        System.out.print(arr1[0] + " ");

        for(int i=1;i<n;i++){
            arr1[i] = arr[i];
            if(i%2==0){
                sortint(i);
            }
        }
    }
}