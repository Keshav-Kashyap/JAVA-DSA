
public class sudoo {

    static boolean isValid(int[][] b, int r, int c, int n) {
        for (int x = 0; x < 9; x++) {
            if (b[r][x] == n)
                return false;
            if (b[x][c] == n)
                return false;
        }
        int sr = (r / 3) * 3;
        int sc = (c / 3) * 3;
        for (int i = sr; i < sr + 3; i++)
            for (int j = sc; j < sc + 3; j++)
                if (b[i][j] == n)
                    return false;
        return true;
    }

    static boolean solve(int[][] b) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (b[r][c] == 0) {
                    for (int n = 1; n <= 9; n++) {
                        if (isValid(b, r, c, n)) {
                            b[r][c] = n;
                            if (solve(b))
                                return true;
                            b[r][c] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    static void print(int[][] b) {
        for (int[] row : b) {
            for (int num : row)
                System.out.print(num + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] board = {
                { 0, 0, 0, 2, 6, 0, 7, 0, 1 },
                { 6, 8, 0, 0, 7, 0, 0, 9, 0 },
                { 1, 9, 0, 0, 0, 4, 5, 0, 0 },
                { 8, 2, 0, 1, 0, 0, 0, 4, 0 },
                { 0, 0, 4, 6, 0, 2, 9, 0, 0 },
                { 0, 5, 0, 0, 0, 3, 0, 2, 8 },
                { 0, 0, 9, 3, 0, 0, 0, 7, 4 },
                { 0, 4, 0, 0, 5, 0, 0, 3, 6 },
                { 7, 0, 3, 0, 1, 8, 0, 0, 0 }
        };

        if (solve(board))
            print(board);
        else
            System.out.println("nope, can't solve");
    }
}
