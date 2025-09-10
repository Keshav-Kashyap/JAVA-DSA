public class sprialMatrix {

    public static void printSprial(int matrix[][]) {

        int n = matrix.length, m = matrix[0].length;
        int startRow = 0, endRow = n - 1, startColumn = 0, endColumn = m - 1;

        while (startRow <= endRow && startColumn <= endColumn) {

            // top

            for (int j = startColumn; j <= endColumn; j++) {

                System.out.print(matrix[startRow][j] + " ");

            }

            // Right

            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endColumn] + " ");
            }

            // Bottom

            for (int j = endColumn - 1; j >= startColumn; j--) {
                if (startRow == endRow) {
                    break;
                }

                System.out.print(matrix[endRow][j] + " ");
            }

            // left

            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startColumn == endColumn) {
                    break;
                }
                System.out.print(matrix[i][startColumn] + " ");

            }

            startRow++;
            endRow--;
            startColumn++;
            endColumn--;

        }

    }

    public static void main(String[] args) {

        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        printSprial(matrix);

    }

}