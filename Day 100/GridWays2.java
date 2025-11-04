public class GridWays2 {

    public static int fact(int n) {
        if (n == 1 || n == 0)
            return 1;
        return n * fact(n - 1);
    }

    public static int gridWays2(int n, int m) {

        if (n - 1 == 0 || m - 1 == 0) {
            return 1;
        }
        return fact((n - 1) + (m - 1)) / (fact(n - 1) * fact(m - 1));
    }

    public static void main(String[] args) {

        System.out.println(gridWays2(9, 51));

    }
}
