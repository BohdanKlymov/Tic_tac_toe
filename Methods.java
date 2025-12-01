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

    public static boolean victoryCheck(String [][] board) {

        String userWin = "You won.";
        String machineWin = "You lost.";

        if (board[0][0] == "x" && board[0][1] == "x" && board[0][2] == "x") {

            board[0][0] = "\uD83E\uDD73";
            board[0][1] = "\uD83E\uDD73";
            board[0][2] = "\uD83E\uDD73";

            Methods.printBoard(board);
            System.out.println(userWin);
            return true;

        } else if (board[0][0] == "x" && board[1][1] == "x" && board[2][2] == "x") {

            board[0][0] = "\uD83E\uDD73";
            board[1][1] = "\uD83E\uDD73";
            board[2][2] = "\uD83E\uDD73";

            Methods.printBoard(board);
            System.out.println(userWin);
            return true;
        }
        return false;
    }

}
