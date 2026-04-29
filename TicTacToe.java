public class TicTacToe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human's turn");
                // call method to take input + place move
            } else {
                System.out.println("Computer's turn");
                // call method for computer move
            }

            // Switch turn
            isHumanTurn = !isHumanTurn;

            // TEMP condition to stop loop (remove later)
            gameOver = true;
        }
    }
}