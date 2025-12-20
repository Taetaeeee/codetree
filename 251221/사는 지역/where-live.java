import java.util.Scanner;
class People{
    String name;
    String address;
    String region;

    public People(String name, String address, String region){
        this.name = name;
        this.address = address;
        this.region = region;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        String[] addresses = new String[n];
        String[] regions = new String[n];
        
        People[] people1 = new People[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            addresses[i] = sc.next();
            regions[i] = sc.next();

            people1[i] = new People(names[i], addresses[i], regions[i]);
        }
        // Please write your code here.

        int lastIdx = 0;
        for(int i=1;i<n;i++){
            if(people1[i].name.compareTo(people1[lastIdx].name)>0)
                lastIdx = i;
        }

        System.out.println("name " + people1[lastIdx].name);
        System.out.println("addr " + people1[lastIdx].address);
        System.out.println("city " + people1[lastIdx].region);
    }
}