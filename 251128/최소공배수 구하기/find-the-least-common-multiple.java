import java.util.Scanner;

public class Main {
    public static void find(int n, int m){
        int find = 1;
        int min;
        
        if(n>m)
            min = m;
        else
            min = n;

        for(int i=1;i<min;i++){
            if(n%i==0 && m%i==0)
                find*=i;
        }
        System.out.print(find);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        find(n, m);
    }
}