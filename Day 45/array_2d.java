import java.util.Scanner;

public class array_2d {

    public static void getMat(int matrix[][]) {
        int n = matrix.length, m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

    }

    public static boolean search(int matrix[][], int key) {

        int n = matrix.length, m = matrix[0].length;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (key == matrix[i][j]) {

                    return true;
                }

            }
        }

        return false;

    }

    public static void setMatrix(int matrix[][]) {

        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Enter Element no.(" + i + "," + j + "): ");
                matrix[i][j] = sc.nextInt();

            }
        }

    }

    public static void main(String[] args) {

        int matrix[][] = new int[3][3];
        int key = 4;

        setMatrix(matrix);
        getMat(matrix);
        System.out.println(search(matrix, key));

    }
}
