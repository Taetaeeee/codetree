import java.util.*;

class Tile {
    int whiteCount = 0;
    int blackCount = 0;
    char color = 'N'; 
    // N: 아직 안 칠함
    // W: 흰색
    // B: 검은색
    // G: 회색
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<Integer, Tile> tiles = new HashMap<>();

        int position = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            String dir = sc.next();

            if (dir.equals("L")) {
                for (int j = 0; j < x; j++) {
                    int cur = position - j;

                    Tile tile = tiles.getOrDefault(cur, new Tile());

                    if (tile.color != 'G') {
                        tile.whiteCount++;

                        if (tile.whiteCount >= 2 && tile.blackCount >= 2) {
                            tile.color = 'G';
                        } else {
                            tile.color = 'W';
                        }
                    }

                    tiles.put(cur, tile);
                }

                position = position - (x - 1);
            } else {
                for (int j = 0; j < x; j++) {
                    int cur = position + j;

                    Tile tile = tiles.getOrDefault(cur, new Tile());

                    if (tile.color != 'G') {
                        tile.blackCount++;

                        if (tile.whiteCount >= 2 && tile.blackCount >= 2) {
                            tile.color = 'G';
                        } else {
                            tile.color = 'B';
                        }
                    }

                    tiles.put(cur, tile);
                }

                position = position + (x - 1);
            }
        }

        int white = 0;
        int black = 0;
        int gray = 0;

        for (Tile tile : tiles.values()) {
            if (tile.color == 'W') {
                white++;
            } else if (tile.color == 'B') {
                black++;
            } else if (tile.color == 'G') {
                gray++;
            }
        }

        System.out.println(white + " " + black + " " + gray);
    }
}