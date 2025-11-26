import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int [][] arr2d = new int[N][N];

        for(int i=0;i<M;i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            arr2d[r-1][c-1] = 1;
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}