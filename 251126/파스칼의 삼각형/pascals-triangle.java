import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [][] arr2d = new int [N][N];

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr2d[i][j] = 1;
            }
        }

        for(int i=2;i<N;i++){
            for(int j=1;j<i;j++){
                arr2d[i][j] = arr2d[i-1][j-1] + arr2d[i-1][j];
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}