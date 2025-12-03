import java.util.Random;

public class Methods {

    public static void printBoard(String[][] board) {
        for (String[] row : board) {
            for (String element : row) {
                System.out.print(element + "  ");
            }
            System.out.println();
        }
    }

    public static boolean isInteger(String s) {
        if (s == null || s.isEmpty()) return false;
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void machineTurn(String [][] board) {
        Random random=new Random();

        boolean endPoint = false;

        while (!endPoint) {

            int column = random.ints(1, 4).limit(1).sum();
            int row = random.ints(1, 4).limit(1).sum();

            int col = Integer.parseInt(String.valueOf(column));
            int r   = Integer.parseInt(String.valueOf(row));

            if (board[col - 1][r - 1] == "*") {
                board[col - 1][r - 1] = "o";

                Methods.printBoard(board);

                endPoint = true;
            }

        }
    }

    public static boolean victoryCheck(String[][] board) {
        String[] players = {"x", "o"};
        String[] messages = {"You won.", "You lost.", "Draw."};

        for (int p = 0; p < players.length; p++) {
            String s = players[p];

            for (int i = 0; i < 3; i++) {
                if (board[i][0].equals(s) && board[i][1].equals(s) && board[i][2].equals(s)) {
                    highlightWin(board, i, 0, i, 1, i, 2);
                    System.out.println("\n");
                    Methods.printBoard(board);
                    System.out.println(messages[p]);
                    return true;
                }
            }

            for (int i = 0; i < 3; i++) {
                if (board[0][i].equals(s) && board[1][i].equals(s) && board[2][i].equals(s)) {
                    highlightWin(board, 0, i, 1, i, 2, i);
                    System.out.println("\n");
                    Methods.printBoard(board);
                    System.out.println(messages[p]);
                    return true;
                }
            }

            if (board[0][0].equals(s) && board[1][1].equals(s) && board[2][2].equals(s)) {
                highlightWin(board, 0, 0, 1, 1, 2, 2);
                System.out.println("\n");
                Methods.printBoard(board);
                System.out.println(messages[p]);
                return true;
            }

            if (board[0][2].equals(s) && board[1][1].equals(s) && board[2][0].equals(s)) {
                highlightWin(board, 0, 2, 1, 1, 2, 0);
                System.out.println("\n");
                Methods.printBoard(board);
                System.out.println(messages[p]);
                return true;
            }
        }

        return false;
    }

    private static void highlightWin(String[][] board,
                                     int r1, int c1,
                                     int r2, int c2,
                                     int r3, int c3) {
        board[r1][c1] = "\uD83E\uDD73";
        board[r2][c2] = "\uD83E\uDD73";
        board[r3][c3] = "\uD83E\uDD73";
    }

}
