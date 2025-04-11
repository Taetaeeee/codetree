import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        arr[0] = sc.nextInt();
        int min = arr[0];
        int max = arr[0];

        while(true){
            int n = sc.nextInt();
            
            if(n==999||n==-999){
                break;
            }
            if(n<min){
                min = n;
            }
            if(n>max){
                max = n;
            }
        }

        System.out.print(max + " " + min);

    }
}