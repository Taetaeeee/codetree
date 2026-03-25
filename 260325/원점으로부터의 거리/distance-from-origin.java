import java.util.Scanner;
import java.util.*;

class Distance implements Comparable<Distance> {
    int x, y, num, distance;

    public Distance(int x, int y, int num){
        this.x = x;
        this.y = y;
        this.num = num;
        this.distance = calcDistance(x, y);
    }

    public int calcDistance(int x, int y){
        return Math.abs(x-0) + Math.abs(y-0);
    }

    @Override
    public int compareTo(Distance distance){
        return this.distance - distance.distance;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Distance[] distances = new Distance[n];

        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            // Please write your code here.

            distances[i] = new Distance(height, weight, i+1);
        }

        Arrays.sort(distances);

        for(int i=0;i<n;i++){
            System.out.println(distances[i].num);
        }
    }
}