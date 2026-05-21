import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int day = 11, hour = 11, minute = 11;

        int cnt = 0;
        int elapsedTime=0;

        if(day>A){
            cnt = -1;
        }
        else if(day==A && hour>B)
        {
            cnt = -1;
        }
        else if(day==A && hour==B && minute>C){
            cnt = -1;
        }

        while(true){
            if((day == A && hour == B && minute == C) || (cnt ==-1)){
                break;
            }

            elapsedTime++;
            minute++;

            if(minute==60){
                hour++;
                minute=0;
            }
            else if(hour == 24)
            {
                day++;
                hour=0;
            }
        }

        if(cnt!=-1){
            System.out.print(elapsedTime);
        }
        else{
            System.out.print(cnt);
        }
    }
}