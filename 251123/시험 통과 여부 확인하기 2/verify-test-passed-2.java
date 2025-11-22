import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //학생 인원수
        int [] arr = new int[4];
        int cnt = 0;

        for(int i=0; i<N; i++){
            int sum = 0;
            int avg = 0;
            for(int j=0; j<4; j++){
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            avg = sum/4;
            if(avg>=60){
                System.out.println("pass");
                cnt++;
            }
            else
                System.out.println("fail");
        }
        System.out.println(cnt);
    }
}