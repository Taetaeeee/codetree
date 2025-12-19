import java.util.Scanner;
class agent{
    char id;
    int value;

    public agent(char id, int value){
        this.id = id;
        this.value = value;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        agent[] agents = new agent[5];

        for(int i=0;i<5;i++){
            char id = sc.next().charAt(0);
            int value = sc.nextInt();
            agents[i] = new agent(id, value);
        }

        int min = 1000;
        int cnt = 0;
        for(int i=0;i<5;i++){
            if(min>agents[i].value){
                min = agents[i].value;
                cnt = i;
            }
        }
        System.out.println(agents[cnt].id + " " + agents[cnt].value);
    }
}