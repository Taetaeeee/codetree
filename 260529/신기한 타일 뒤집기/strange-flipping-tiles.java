import java.util.*;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

                    int n = sc.nextInt();

                            HashMap<Integer, Character> tiles = new HashMap<>();

                                    int position = 0;

                                            for (int i = 0; i < n; i++) {
                                                        int x = sc.nextInt();
                                                                    String dir = sc.next();

                                                                                if (dir.equals("L")) {
                                                                                                for (int j = 0; j < x; j++) {
                                                                                                                    int cur = position - j;
                                                                                                                                        tiles.put(cur, 'W');
                                                                                                                                                        }

                                                                                                                                                                        position = position - (x - 1);
                                                                                                                                                                                    } else {
                                                                                                                                                                                                    for (int j = 0; j < x; j++) {
                                                                                                                                                                                                                        int cur = position + j;
                                                                                                                                                                                                                                            tiles.put(cur, 'B');
                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                            position = position + (x - 1);
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                                        int white = 0;
                                                                                                                                                                                                                                                                                                                int black = 0;

                                                                                                                                                                                                                                                                                                                        for (char color : tiles.values()) {
                                                                                                                                                                                                                                                                                                                                    if (color == 'W') {
                                                                                                                                                                                                                                                                                                                                                    white++;
                                                                                                                                                                                                                                                                                                                                                                } else if (color == 'B') {
                                                                                                                                                                                                                                                                                                                                                                                black++;
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                                                                                                                                            System.out.println(white + " " + black);
                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                }