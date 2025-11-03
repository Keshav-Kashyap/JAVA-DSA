public class nQueens {

public static void nQueen(int board[][], int  row , int n){
    if(row == n){
    printBoard(board[][]);
    return;

    }
}

    public static void printBoard(int board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                System.out.println(board[i][j]);

            }

        }
    }

    public static void main(String[] args) {

        int board[][] = new int[4][4];

    }
}