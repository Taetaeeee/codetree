import java.util.Scanner;
import java.util.Arrays;

class People implements Comparable<People>{
    String name;
    int height;
    int weight;

    public People(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(People people){
        return this.height - people.height;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        People[] peoples = new People[n];

        for(int i=0;i<n;i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            peoples[i] = new People(name, height, weight);
        }
        
        Arrays.sort(peoples);

        for(int i=0;i<n;i++){
            System.out.println(peoples[i].name + " " + peoples[i].height + " " + peoples[i].weight);
        }

    }
}