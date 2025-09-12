public class Que3 {

    public static void Transport(int matrix[][]) {
        int trans[][] = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                trans[i][j] = matrix[j][i];

            }
        }

        System.out.println();
        printMat(trans);
    }

    public static void printMat(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        printMat(matrix);
        Transport(matrix);

    }
}
