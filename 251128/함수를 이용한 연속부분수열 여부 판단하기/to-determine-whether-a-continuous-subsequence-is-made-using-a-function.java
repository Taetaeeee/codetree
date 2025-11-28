import java.util.Scanner;
public class Main {
    public static boolean isjudge(int[] arr1, int[] arr2){
        int len = arr2.length;
        int startIndex = 0;
        
        for(int i=0;i<arr1.length-len+1;i++){
            if(arr1[i]==arr2[0])
                startIndex = i;

            int cnt = 0;
            for(int j=0;j<len;j++){
                if(arr1[j+startIndex] == arr2[j])
                    cnt++;
            }

            if(cnt == len)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.

        if(isjudge(a, b))
            System.out.print("Yes");
        else
            System.out.print("No");

    }
}