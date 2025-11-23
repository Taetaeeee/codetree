import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int min = 0;
        int max = 1001;

        for(int i=0; i<10;i++){
            int n = sc.nextInt();

            if(n<500){
                if(n>min)
                    min = n;
            }
            else
            {
                if(n<max)
                    max = n;
            }
        }
        System.out.print(min + " " + max);
    }
}