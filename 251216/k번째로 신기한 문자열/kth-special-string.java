import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static String[] Twords = new String[100];
    public static void Tcount(int n, String[] words, String t){
        int count = 0;
        for(int i=0;i<n;i++){
            String w = words[i];
            if(w.startsWith(t)){
                Twords[count] = words[i];
                count++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // Please write your code here.
        Arrays.sort(words);
        Tcount(n, words, t);

        System.out.println(Twords[k-1]);
    }
}