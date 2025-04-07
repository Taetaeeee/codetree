import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<q;i++){
            int q1 = sc.nextInt();
            if(q1 == 1){
                int a = sc.nextInt();
                System.out.println(arr[a-1]);
            }
            else if(q1 == 2){
                int b = sc.nextInt();
                for(int j=0;j<n;j++){
                    if(arr[j]==b){
                        System.out.println(j+1);
                        cnt++;
                        break;
                    }
                }
                if(cnt==n){
                    System.out.println("0");
                }
            }
            else if(q1 == 3){
                int s = sc.nextInt();
                int e = sc.nextInt();

                for(int k=s-1;k<e;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}