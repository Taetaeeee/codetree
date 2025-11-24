import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int [][] arr2d = new int[2][4];

        double total_sum = 0;

        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                arr2d[i][j] = sc.nextInt();
                total_sum+=arr2d[i][j];
            }
        }

        double [] x_arr = new double [2];
        double [] y_arr = new double [4];

        for(int i=0;i<2;i++){
            double x_sum = 0;
            for(int j=0;j<4;j++){
                x_sum+=arr2d[i][j];
            }
            x_arr[i] = x_sum;
            System.out.printf("%.1f ", x_arr[i]/4);
        }
        System.out.println();

        for(int i=0;i<4;i++){
            double y_sum = 0;
            for(int j=0;j<2;j++){
                y_sum+=arr2d[j][i];
            }
            y_arr[i] = y_sum;
            System.out.printf("%.1f ", y_arr[i]/2);
        }
        System.out.println();
        System.out.printf("%.1f", total_sum/8);
    }
}