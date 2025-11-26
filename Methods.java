public class Methods {

    public static void printBoard(String[][] board) {
        for (String[] row : board) {
            for (String element : row) {
                System.out.print(element + "  ");
            }
            System.out.println();
        }
    }

}
