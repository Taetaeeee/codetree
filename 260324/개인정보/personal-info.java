import java.util.*;

class People implements Comparable<People> {
    String name;
    int height;
    double weight;

    public People(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(People people) {
        return this.name.compareTo(people.name);   // 이름 오름차순
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        People[] peoples = new People[5];

        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();

            peoples[i] = new People(name, height, weight);
        }

        Arrays.sort(peoples);
            
        System.out.println("name");

        for (int i = 0; i < 5; i++) {
            System.out.printf("%s %d %.1f\n", peoples[i].name, peoples[i].height, peoples[i].weight);
        }

        Arrays.sort(peoples, new Comparator<People>() {
            @Override
            public int compare(People a, People b) {
                return b.height - a.height;   // 키 내림차순
            }
        });

        System.out.println("\nheight");

        for (int i = 0; i < 5; i++) {
            System.out.printf("%s %d %.1f\n", peoples[i].name, peoples[i].height, peoples[i].weight);
        }
    }
}