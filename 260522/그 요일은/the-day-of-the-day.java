import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String day_n = sc.next();
        //System.out.print(day_n);

        int month = m1, day = d1;

        //                              0    1    2    3    4    5    6
        String [] days = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int [] num_of_days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day_n1 = 0;

        for(int i=0;i<7;i++){
            //System.out.print(days[i]);
            if(day_n.equals(days[i]))
            {
                day_n1 = i;
            }

        }
        //System.out.print(day_n1);

        int daycnt = 0;
        int cnt = 0;
        while(true){
            if(day_n1 == daycnt){
                cnt++;
            }
            
            if(month==m2 && day==d2){
                break;
            }
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
        System.out.print(cnt);
    }
}

