import java.util.Scanner;
class Predict{
    String date;
    String day;
    String weather;

    public Predict(String date, String day, String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Predict[] predict1 = new Predict[n];
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            // Please write your code here.

            predict1[i] = new Predict(date, day, weather);
        }

        int rainidx = 0;
        for(int i=1;i<n;i++){
            if(predict1[i].weather.equals("Rain") && predict1[i].date.compareTo(predict1[rainidx].date)>0){
                rainidx = i;
                break;
            }
        }

        System.out.print(predict1[rainidx].date + " ");
        System.out.print(predict1[rainidx].day + " ");
        System.out.print(predict1[rainidx].weather);
    }
}