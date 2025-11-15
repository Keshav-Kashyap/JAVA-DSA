public class nQueensRevsion {

    public static void nQueens(char board[][], int row, int n) {

        if (row == n) {
            System.out.println("New Chess board:");
            printBoard(board);
            return;
        }

        // kaam kiya karana hai!!

        // j -> col
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q';
                nQueens(board, row + 1, n);
                board[row][col] = '.';
            }
        }

    }

    public static boolean isSafe(char board[][], int row, int col, int n) {

        // same row
        for (int j = 0; j < n; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }
        // same column

        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // left up digonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // right up digonal

        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char board[][]) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        char board[][] = new char[4][4];

        nQueens(board, 0, 4);

    }
}
