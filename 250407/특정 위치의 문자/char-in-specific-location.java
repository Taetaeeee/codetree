import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char[] word = new char[] {'L', 'E', 'B', 'R', 'O', 'S'};
        char c = sc.next().charAt(0);
        int itx = -1;
        
        for(int i=0;i<6;i++){
            if(word[i] == c){
                itx = i;
            }
        }

        if(itx==-1){
            System.out.print("None");
        }
        else{
            System.out.print(itx);
        }
    }
}