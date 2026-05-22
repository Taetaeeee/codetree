import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int month = m1, day = d1;

        boolean isfront = true;

        if(m1>m2 || (m1==m2 && d1>d2)){
            isfront = false;
        }

        //                              0    1    2    3    4    5    6
        String [] days = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int [] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int daycnt = 1; //월요일부터 시작.

        while(true){
            if(month==m2 && day==d2){
                break;
            }

            if(isfront==true){
                day++;
                daycnt++;

                if(day>num_of_days[month]){
                    month++;
                    day = 1;
                }
                if(daycnt>6){
                    daycnt = 0;
                }
            }
            else{
                day--;
                daycnt--;

                if(day<1){
                    month--;
                    day = num_of_days[month];
                }
                if(daycnt<0){
                    daycnt = 6;
                }
            }


        }
        System.out.print(days[daycnt]);
    }
}