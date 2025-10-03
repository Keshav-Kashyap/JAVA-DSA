public class xTon {

    public static int xPower(int x, int power) {

        if (power == 1) {
            return x;
        }

        return x * xPower(x, power - 1);

    }

    public static void main(String[] args) {

        System.out.println(xPower(3, 3));
    }

}
