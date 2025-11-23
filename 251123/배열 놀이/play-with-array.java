import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int [] arr = new int[N];

        for(int i=0; i<N;i++){
            arr[i] = sc.nextInt();
        }

        int q, a, b, s, e;
        int idx = -1;
        for(int i=0;i<Q;i++){
            q = sc.nextInt();
            if(q==1){
                a = sc.nextInt();
                System.out.println(arr[a-1]);
            }
            else if(q==2){
                b = sc.nextInt();
                for(int j=0;j<N;j++){
                    if(arr[j]==b){
                        idx = j;
                        break;
                    }
                }
                if(idx==-1)
                    System.out.println("0");
                else
                    System.out.println(idx+1);
            }
            else if(q==3){
                s = sc.nextInt();
                e = sc.nextInt();

                for(int j=s-1;j<e;j++){
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}