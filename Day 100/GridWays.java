public class GridWays {

    public static int gridWay(int x, int y, int n, int m) {
        if (x == n - 1 || y == m - 1) {
            return 1;
        }
        return gridWay(x, y + 1, n, m) + gridWay(x + 1, y, n, m);

    }

    public static void main(String[] args) {

        System.out.println(gridWay(0, 0, 1, 3));

    }

}