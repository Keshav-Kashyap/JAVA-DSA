public class triangle {
    public static void main(String[] args) {

        int n = 4;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (i + j >= n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (int j = n - 1; j > -1; j--) {

                if (i + j > n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) {

            for (int j = 0; j < n; j++) {
                if (i + j >= n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (int j = n - 1; j > -1; j--) {

                if (i + j > n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
