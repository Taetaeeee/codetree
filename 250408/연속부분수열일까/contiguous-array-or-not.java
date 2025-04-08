import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int an = sc.nextInt();
        int bn = sc.nextInt();

        int[] arra = new int[an];
        int[] arrb = new int[bn];

        for(int i=0;i<an;i++){
            int an1 = sc.nextInt();
            arra[i] = an1;
        }
        for(int i=0;i<bn;i++){
            int bn1 = sc.nextInt();
            arrb[i] = bn1;
        }
        int cntb = 0;
        for(int i=0;i<an;i++){
            if(arra[i] == arrb[0] && (i+an) <= bn){
                for(int j=0;j<bn;j++){
                    if(arra[i+j] == arrb[j]){
                        cntb++;
                    }
                }
            }
        }
        if(cntb == bn){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}