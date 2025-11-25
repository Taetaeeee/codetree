import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int [][] arr2d = new int[N][M];

        int Num = 0;
        int cnt = 0;

        while(Num != N*M){
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    if(i+j==cnt){
                        arr2d[i][j] = Num+1;
                        Num++;
                    }
                }
            }
            cnt++;
        }


        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// 3*3
// 00 01 02
// 10 11 12
// 20 21 22

// i = 0 // 0 / 1 // 0 / 1 / 2 // 1 / 2 // 2
// j = 0 // 1 / 0 // 2 / 1 / 0 // 2 / 1 // 2
//     0    1   1    2   2   2    3   3    4
//    i+j-2


// 2*2
// 00 01
// 10 11

// i = 0 // 0 / 1 // 1
// j = 0 // 1 / 0 // 1
//     0    1   1    2

// 4*2
// 00 01 02 03
// 10 11 12 13

// i = 0 // 0 / 1 // 0 / 1 // 0 / 1 // 1
// j = 0 // 1 / 0 // 2 / 1
