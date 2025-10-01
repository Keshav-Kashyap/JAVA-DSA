
public class sumOfN {

    public static int sumof(int n) {

        if (n == 1) {
            return 1;
        }

        return n + sumof(n - 1);

    }

    public static void main(String[] args) {

        System.out.println(sumof(5));

    }
}