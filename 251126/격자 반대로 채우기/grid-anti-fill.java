import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [][] arr2d = new int[N][N];

        int Num = 1;
        boolean T = true;
        for(int i=N-1;i>=0;i--){
            if(T==false){
                for(int j=0;j<N;j++){
                    arr2d[j][i] = Num;
                    Num++;
                }
                T=true;
            }
            else{
                for(int j=N-1;j>=0;j--){
                    arr2d[j][i] = Num;
                    Num++;
                }
                T=false;
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// 00 01 02
// 10 11 12
// 20 21 22

// 22 12 02 01 11 21 20 10 00
// j = 2 1 0 0 1 2 2 1 0
// i = 2 2 2 1 1 1 0 0 0