import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()
        int min = n;
        int max = n;

        while(true){
            int n1 = sc.nextInt();
            
            if(n==999||n==-999){
                break;
            }
            if(n<min){
                min = n;
            }
            if(n>max){
                max = n;
            }
        }

        System.out.print(max + " " + min);

    }
}