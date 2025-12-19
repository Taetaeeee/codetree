import java.util.Scanner;
class codetree{
    String id;
    int level;

    public codetree(){
        this.id = "codetree";
        this.level = 10;

        System.out.println("user " + id + " lv " + level);
    }
    public codetree(String id, int level){
        this.id = id;
        this.level = level;

        System.out.println("user " + id + " lv " + level);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.

        codetree codetree1 = new codetree();
        codetree codetree2 = new codetree(id, level);
    }
}