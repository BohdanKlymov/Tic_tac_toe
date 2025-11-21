import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Tic-tac-toe game:");
        System.out.println("You will automatically use 'x'.");
        System.out.println("Write down two numbers. The first number is the position of “x” in the column, and the second is in the row. \nYour options for each method: 1-3.");

        String[][] fields = {
                {"*", "*", "*"},
                {"*", "*", "*"},
                {"*", "*", "*"}
        };

        for (String[] row : fields) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        Scanner userInput = new Scanner(System.in);
        boolean endPoint = false;

        while (!endPoint){
            System.out.print("Position in column: ");
            String column = userInput.nextLine().trim();;

            System.out.print("Position in row: ");
            String row = userInput.nextLine().trim();;

            if (isInteger(column) || isInteger(row)) {
                if (Integer.parseInt(column) < 4 || Integer.parseInt(column) > 0 || Integer.parseInt(row) < 4 || Integer.parseInt(row) > 0) {

                }
                else {
                    System.out.println("Your options for each method: 1-3.");
                }
            }
            else {
                System.out.println("You can only write numbers.");
            }

        }
        userInput.close();
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
}