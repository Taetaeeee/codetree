import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [][] arr2d = new int[N][M];

        int Num = 0;
        for(int i=0;i<M;i++){
            if(i%2==0){
                for(int j=0;j<N;j++){
                    arr2d[j][i] = Num;
                    Num++;
                }
            }
            else{
                for(int j=N-1;j>=0;j--){
                    arr2d[j][i] = Num;
                    Num++;
                }
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}