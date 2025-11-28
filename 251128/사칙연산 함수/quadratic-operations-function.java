import java.util.Scanner;
public class Main {
    public static int plus(int a, int c){
        return a+c;
    }
    public static int minus(int a, int c){
        return a-c;
    }
    public static int divide(int a, int c){
        return a/c;
    }
    public static int conbine(int a, int c){
        return a*c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.
        if(o=='+'){
            System.out.print(a + " + " + c + " = " + plus(a,c));
        }
        else if(o=='-'){
            System.out.print(a + " - " + c + " = " + minus(a,c));
        }
        else if(o=='/'){
            System.out.print(a + " / " + c + " = " + divide(a,c));
        }
        else if(o=='*'){
            System.out.print(a + " * " + c + " = " + conbine(a,c));
        }
        else{
            System.out.print("False");
        }
    }
}