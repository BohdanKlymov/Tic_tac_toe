import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Tic-tac-toe game:");
        System.out.print("You need to use 'x'");

        String[][] filds = {
                {"\n", "*", "*", "*", "\n"},
                {"*", "*", "*", "\n"},
                {"*", "*", "*", "\n"}
        };

        for (int i = 0; i < filds.length; i++) {
            for (int j = 0; j < filds[i].length; j++) {
                System.out.print(filds[i][j] + " ");
            }
        }

        Scanner userInput = new Scanner(System.in);
        boolean endPoint = false;

        while (!endPoint){
            System.out.print("It's your turn: ");
            String userTurn = userInput.nextLine();

            if (userTurn.equals("x")) {
                System.out.println("You printed 'x'");
                endPoint = true;
            }
        }
        userInput.close();
    }
}