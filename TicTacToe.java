package org.example;
public class Main {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        initializeBoard();

        int row = 1;
        int col = 1;

        if (isValidMove(row, col)) {
            System.out.println("Move is valid.");
        } else {
            System.out.println("Invalid move.");
        }
    }

    // Initialize board with '-'
    static void initializeBoard() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                board[r][c] = '-';
            }
        }
    }

    // Validate move
    static boolean isValidMove(int row, int col) {

        // Check bounds
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}