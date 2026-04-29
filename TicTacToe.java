static void computerMove() {
    Random rand = new Random();

    int row, col;

    while (true) {
        row = rand.nextInt(3); // 0–2
        col = rand.nextInt(3); // 0–2

        if (board[row][col] == '-') {
            board[row][col] = computerSymbol;
            System.out.println("Computer placed at: " + row + ", " + col);
            break;
        }
    }
}