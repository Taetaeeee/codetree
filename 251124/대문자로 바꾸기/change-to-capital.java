import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char [][] arr2d = new char[5][3];

        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                char a = sc.next().charAt(0);
                arr2d[i][j] = Character.toUpperCase(a);
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}