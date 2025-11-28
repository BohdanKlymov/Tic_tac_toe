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

        random.ints(1, 4)
                .limit(2)
                .forEach(System.out::println);
    }

}
