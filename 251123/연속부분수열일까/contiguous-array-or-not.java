import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        int [] A = new int[N1];
        int [] B = new int[N2];

        for(int i=0;i<N1;i++){
            A[i] = sc.nextInt();
        }
        for(int i=0;i<N2;i++){
            B[i] = sc.nextInt();
        }

        for(int i=0;i<N1;i++){
            boolean result = true;
            for(int j=0;j<N2;j++){
                if(i+j>=N1){
                    result = false;
                    break;
                }
                if(A[i+j]!=B[j])
                {
                    result = false;
                    break;
                }
            }
            if(result){
                System.out.println("Yes");
                System.exit(0);
            }
        }
         System.out.println("No");
    }
}