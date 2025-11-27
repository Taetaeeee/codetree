import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[3];

        for(int i=0;i<3;i++){
            arr[i] = sc.next().length();
        }

        int min= arr[0];
        int max = arr[0];

        for(int i=1;i<3;i++){
            if(min>arr[i]){
                min = arr[i];
            }
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.print(max-min);
    }
}