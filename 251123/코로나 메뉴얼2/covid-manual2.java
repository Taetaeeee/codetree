import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char YN;
        int C;
        int [] arr = new int[4];

        for(int i=0;i<3;i++){
            YN = sc.next().charAt(0);
            C = sc.nextInt();

            if(YN == 'Y' && C>=37)
                arr[0]++;
            else if(C>=37)
                arr[1]++;
            else if(YN == 'Y')
                arr[2]++;
            else
                arr[3]++;
            
        } 

        for(int i=0;i<4;i++){
            System.out.print(arr[i] + " ");
        }
        if(arr[0]>=2)
            System.out.print("E");
    }
}