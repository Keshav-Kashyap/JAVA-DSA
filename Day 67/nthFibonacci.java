public class nthFibonacci {

    public static int fibonacci(int n) {

        if (n == 1 || n == 0) {

            return n;
        }

        int fib = fibonacci(n - 1) + fibonacci(n - 2);

        return fib;

    }

    public static void main(String[] args) {

        System.out.println(fibonacci(15));

    }
}
