import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] x1 = new int[n];
        int[] x2 = new int[n];

        int min = 101;
        int max = -101;

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();

            min = Math.min(min, x1[i]);
            max = Math.max(max, x2[i]);
        }

        int answer = 0;

        for (int point = min; point <= max; point++) {
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (x1[i] <= point && point <= x2[i]) {
                    count++;
                }
            }

            answer = Math.max(answer, count);
        }

        System.out.println(answer);
    }
}