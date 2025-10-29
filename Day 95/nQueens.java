public class nQueens {
    private int n;
    private boolean[] cols;
    private boolean[] diag1;
    private boolean[] diag2;
    private int[] board;
    private int solutionCount = 0;

    public nQueens(int n) {
        this.n = n;
        cols = new boolean[n];
        diag1 = new boolean[2 * n - 1];
        diag2 = new boolean[2 * n - 1];
        board = new int[n];
    }

    public int solve() {
        solutionCount = 0;
        backtrack(0);
        return solutionCount;
    }

    private void backtrack(int row) {
        if (row == n) {
            solutionCount++;
            printSolution();
            return;
        }
        for (int c = 0; c < n; c++) {
            int d1 = row - c + n - 1;
            int d2 = row + c;
            if (cols[c] || diag1[d1] || diag2[d2])
                continue;

            board[row] = c;
            cols[c] = diag1[d1] = diag2[d2] = true;

            backtrack(row + 1);

            cols[c] = diag1[d1] = diag2[d2] = false;
        }
    }

    private void printSolution() {
        System.out.println("Solution " + solutionCount + ":");
        for (int r = 0; r < n; r++) {
            StringBuilder sb = new StringBuilder();
            for (int c = 0; c < n; c++) {
                sb.append(board[r] == c ? 'Q' : '.');
                if (c < n - 1)
                    sb.append(' ');
            }
            System.out.println(sb);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 8;
        nQueens solver = new nQueens(n);
        int total = solver.solve();
        System.out.println("Total solutions for " + n + "-Queens: " + total);
    }
}
