import java.util.Scanner;

class IntWapper {
    int value;

    public IntWapper(int value){
        this.value = value;
    }
}
public class Main {
    public static void changeNum(IntWapper a, IntWapper b){
        if(a.value>b.value){
            a.value = a.value +25;
            b.value = b.value *2;
        }
        else{
            b.value = b.value + 25;
            a.value = a.value * 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntWapper a = new IntWapper(sc.nextInt());
        IntWapper b = new IntWapper(sc.nextInt());
        // Please write your code here.
        changeNum(a, b);
        System.out.print(a.value + " " + b.value);
    }
}