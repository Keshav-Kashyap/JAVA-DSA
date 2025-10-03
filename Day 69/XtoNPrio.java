public class XtoNPrio {

    public static int xPower(int x, int n) {
        if (n == 1) {
            return x;
        }

        int halfPower = xPower(x, n / 2);
        int halfPowersq = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowersq = x * halfPowersq;
        }

        return halfPowersq;

    }

    public static void main(String[] args) {

        System.out.println(xPower(2, 10));

    }
}
