public class nQueens {

    public static void nQueen(char board[][], int row, int n) {
        if (row == n) {
            printBoard(board);
            return;
        }

        for (int j = 0; j < n; j++) {
            if (isSafe(board[][],row,j,n)) {

                board[row][j] = 'Q';
                nQueen(board, row + 1, n);
                board[row][j] = '.';

            }

        }

    }

    public static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                System.out.println(board[i][j]);

            }

        }
    }

    public static boolean isSafe(char board[][], int row, int col, int n) {

        // same row

        for (int j = 0; j < n; j++) {
            if (board[row][j] == 'Q')
                return false;
        }

        // same column

        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q')
                return false;

        }
        // Left up Digonal

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {

            if (board[i][j] == 'Q')
                return false;

        }
        // Right Dignoal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        // kisi main bhi nhi gye bhai to safe hai

        return true;

    }

    public static void main(String[] args) {

        char board[][] = new char[4][4];

        nQueen(board, 0, 4);
    }
}