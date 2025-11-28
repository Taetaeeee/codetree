import java.util.Scanner;
public class Main {
    public static void modifyarr(int [] arr2, int n){
        for(int i=0;i<n;i++){
            if(arr2[i]%2==0){
                arr2[i] = arr2[i]/2;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        modifyarr(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}