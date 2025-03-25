import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int cnt_c = 0;
        int cnt_w = 0;
        int cnt_b = 0;
        
        for(int i=1;i<=d;i++){
            if(i%2==0&&i%3==0&&i%12==0){
                cnt_b++;
            }
            else if((i%2==0&&i%12==0) || (i%3==0&&i%12==0)){
                cnt_b++;
            }
            else if(i%2==0&&i%3==0){
                cnt_w++;
            }
            else if(i%2==0)
            {
                cnt_c++;
            }
            else if(i%3==0){
                cnt_w++;
            }
            else if(i%12==0){
                cnt_b++;
            }
        }
        System.out.print(cnt_c + " " + cnt_w + " " + cnt_b);
    }
}