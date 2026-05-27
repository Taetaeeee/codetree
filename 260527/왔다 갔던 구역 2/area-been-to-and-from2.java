import java.util.*;

class Segment {
    int start;
    int end;

    public Segment(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Segment> segments = new ArrayList<>();
        ArrayList<Integer> points = new ArrayList<>();

        int current = 0;
        points.add(current);

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            String dir = sc.next();

            int next;

            if (dir.equals("L")) {
                next = current - x;
            } else {
                next = current + x;
            }

            int start = Math.min(current, next);
            int end = Math.max(current, next);

            segments.add(new Segment(start, end));

            points.add(start);
            points.add(end);

            current = next;
        }

        Collections.sort(points);

        ArrayList<Integer> unique = new ArrayList<>();

        for (int point : points) {
            if (unique.size() == 0 || unique.get(unique.size() - 1) != point) {
                unique.add(point);
            }
        }

        int answer = 0;

        for (int i = 0; i < unique.size() - 1; i++) {
            int left = unique.get(i);
            int right = unique.get(i + 1);

            int count = 0;

            for (Segment segment : segments) {
                if (segment.start <= left && right <= segment.end) {
                    count++;
                }
            }

            if (count >= 2) {
                answer += right - left;
            }
        }

        System.out.println(answer);
    }
}