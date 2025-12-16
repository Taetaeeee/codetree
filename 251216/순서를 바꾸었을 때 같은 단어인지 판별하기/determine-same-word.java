import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void same(char[] a, char[] b){
        String w1 = new String(a);
        String w2 = new String(b);

        boolean issame = true;

        if(w1.length() != w2.length()){
            issame = false;
        }
        for(int i=0;i<w1.length()-1;i++){
            if(w1.charAt(i)!= w2.charAt(i))
                issame = false;
        }
        
        if(issame==true){
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        // Please write your code here.

        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        same(chars1, chars2);

    }
}