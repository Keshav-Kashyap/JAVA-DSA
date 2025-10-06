public class frndPairing {

    public static int frndPare(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        return frndPare(n - 1) + (n - 1) * frndPare(n - 2);
    }

    public static void main(String[] args) {

        System.out.println(frndPare(5));
    }

}