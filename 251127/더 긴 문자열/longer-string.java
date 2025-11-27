import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        int s1_n = s1.length();
        int s2_n = s2.length();

        if(s1_n>s2_n)
            System.out.print(s1 + " " + s1_n);
        else if(s1_n<s2_n)
            System.out.print(s2 + " " + s2_n);
        else
            System.out.print("same");
    }
}