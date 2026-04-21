import java.util.Scanner;

public class TicTacToe {
    static char[][] b = new char[3][3];
    static char p = 'X';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // initialize
        for (int i=0;i<3;i++)
            for (int j=0;j<3;j++)
                b[i][j]='-';

        while (true) {
            // print board
            for (int i=0;i<3;i++) {
                for (int j=0;j<3;j++)
                    System.out.print(b[i][j]+" ");
                System.out.println();
            }

            // input
            System.out.print("Player "+p+" enter row and col: ");
            int r = sc.nextInt();
            int c = sc.nextInt();

            if (b[r][c]=='-') {
                b[r][c]=p;
            } else {
                System.out.println("Invalid move!");
                continue;
            }

            // win check
            for (int i=0;i<3;i++)
                if ((b[i][0]==p&&b[i][1]==p&&b[i][2]==p) ||
                    (b[0][i]==p&&b[1][i]==p&&b[2][i]==p)) {
                    System.out.println("Player "+p+" wins!");
                    return;
                }

            if ((b[0][0]==p&&b[1][1]==p&&b[2][2]==p) ||
                (b[0][2]==p&&b[1][1]==p&&b[2][0]==p)) {
                System.out.println("Player "+p+" wins!");
                return;
            }

            // switch player
            p = (p=='X') ? 'O':'X';
        }
    }
}