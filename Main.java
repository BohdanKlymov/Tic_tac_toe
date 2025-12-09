import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Tic-tac-toe game: \nYou will automatically use 'x' and your opponent 'o'.");
        System.out.println("Write down two numbers. The first number is the position of “x” in the column, and the second is in the row. \nYour options for each method: 1-3.");

        String[][] fields = {
                {"*", "*", "*"},
                {"*", "*", "*"},
                {"*", "*", "*"}
        };

        Methods.printBoard(fields);

        Scanner userInput = new Scanner(System.in);
        boolean endPoint = false;

        while (!endPoint){
            System.out.print("Position in column: ");
            String column = userInput.nextLine().trim();

            System.out.print("Position in row: ");
            String row = userInput.nextLine().trim();

            if (Methods.isInteger(column) && Methods.isInteger(row)) {

                int col = Integer.parseInt(column);
                int r   = Integer.parseInt(row);

                if (col > 0 && col < 4 && r > 0 && r < 4) {

                    if (fields[col - 1][r - 1].equals("x") || fields[col - 1][r - 1].equals("o")) {
                        System.out.println("This field has already been placed.");
                    }
                    else {
                        fields[col - 1][r - 1] = "x";

                        if (Methods.victoryCheck(fields)) {
                            endPoint = true;
                        }
                        else if (Methods.boardIsFull(fields)) {
                            System.out.println("Draw.");
                            endPoint = true;
                        }
                        else {
                            Methods.machineTurn(fields);

                            if (Methods.victoryCheck(fields)) {
                                endPoint = true;
                            }
                            else if (Methods.boardIsFull(fields)) {
                                System.out.println("Draw.");
                                endPoint = true;
                            }
                        }
                    }
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
}
