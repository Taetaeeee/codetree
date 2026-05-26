import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //주어진 N개수

        int [] arr = new int[200];

        for(int i=0;i<N;i++){
            int x1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;

            for(int j=x1;j<x2;j++){
                arr[j] +=1;
            }
        }

        int num = 0;
        for(int k=0;k<200;k++){
            if(arr[k]>num){
                num = arr[k];
            }
        }

        System.out.print(num);

    }
}