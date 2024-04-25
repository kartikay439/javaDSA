package google_1500;
import java.util.*;

public class NavigatingHazardousTerrain {
    public static void makeFlood(List<int[]> flood, char[][] board) {
        int n = flood.size();
        int i = 0;
        while (i < n) {
            int row = flood.get(i)[0];
            int column = flood.get(i)[1];
            if ((row + 1) < board.length && board[row + 1][column] != 'D' && board[row + 1][column] != 'X') {
                board[row + 1][column] = '*';
                flood.add(new int[]{row + 1, column});
            }
            if ((row - 1) >= 0 && board[row - 1][column] != 'D' && board[row - 1][column] != 'X') {
                board[row - 1][column] = '*';
                flood.add(new int[]{row - 1, column});
            }
            if ((column + 1) < board[0].length && board[row][column + 1] != 'D' && board[row][column + 1] != 'X') {
                board[row][column + 1] = '*';
                flood.add(new int[]{row, column + 1});
            }
            if ((column - 1) >= 0 && board[row][column - 1] != 'D' && board[row][column - 1] != 'X') {
                board[row][column - 1] = '*';
                flood.add(new int[]{row, column - 1});
            }
            i++;
        }
    }

    public static void solve(int step, int r, int c, char[][] board, List<int[]> flood, List<Integer> steps) {
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] == 'D') {
            steps.add(step);
            return;
        }

        if (board[r][c] == 'X' || board[r][c] == 'V') {
            return;
        }

        char[][] sBoard = Arrays.stream(board).map(char[]::clone).toArray(char[][]::new);
        List<int[]> sFlood = new ArrayList<>(flood);
        makeFlood(sFlood, sBoard);
        sBoard[r][c] = 'V';

        solve(step + 1, r + 1, c, sBoard, sFlood, steps);
        solve(step + 1, r - 1, c, sBoard, sFlood, steps);
        solve(step + 1, r, c + 1, sBoard, sFlood, steps);
        solve(step + 1, r, c - 1, sBoard, sFlood, steps);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        List<int[]> flood = new ArrayList<>();
        char[][] board = new char[row][column];

        int startR = 0, startC = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                char cell = sc.next().charAt(0);
                board[i][j] = cell;
                if (cell == 'S') {
                    startR = i;
                    startC = j;
                }
                if (cell == '*') {
                    flood.add(new int[]{i, j});
                }
            }
        }

        List<Integer> steps = new ArrayList<>();
        solve(0, startR, startC, board, flood, steps);
        if (!steps.isEmpty()) {
            System.out.println(Collections.min(steps));
        } else {
            System.out.println("No path found.");
        }
    }
}
