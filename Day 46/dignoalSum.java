public class dignoalSum {

    public static void DignoalSum(int matrix[][]) {

        int n = matrix.length, m = matrix[0].length;
        if (n != m) {
            return;
        }
        int totalSum = 0;

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {

        // if (i == j || (i + j) == n - 1) {
        // totalSum = totalSum + matrix[i][j];
        // } else if (i == j) {
        // sum1 = sum1 + matrix[i][j];
        // } else if ((i + j) == n - 1) {
        // sum2 = sum2 + matrix[i][j];
        // }

        // }
        // }

        // time compolexity o(n)

        for (int i = 0; i < n; i++) {
            // first digonal sum (pd)
            totalSum += matrix[i][i];

            // second digoanl sum (sd)
            if (i != n - 1 - i) {
                totalSum += matrix[i][n - 1 - i];
            }
        }

        // System.out.println("Sum of First Dioganl = " + sum1);
        // System.out.println("Sum of Second Digonal = " + sum2);
        System.out.println("Total Sum of Digonal = " + totalSum);

    }

    public static void main(String[] args) {

        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        DignoalSum(matrix);

    }

}
