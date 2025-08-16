public class Diamond {

    public static void innerLoop(int i, int n) {
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print("*");

        }
    }

    public static void diamond(int n) {

        for (int i = 1; i <= n; i++) {

            innerLoop(i, n);

            System.out.println();

        }

        for (int i = n; i >= 1; i--) {
            if (i != n) {
                innerLoop(i, n);
                System.out.println();
            }

        }

    }

    public static void main(String[] args) {

        diamond(4);

    }
}