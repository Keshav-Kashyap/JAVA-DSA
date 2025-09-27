public class funxOverloading {

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void add(double a, double b, double c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {

        // sum of two integer
        add(5, 3);
        // sum of three integer with same name called polymorphism
        add(5, 2, 2);
        // can add floating point numbers
        add(3.2, 3.8, 3);
        // Hence this is called Polymorphism
    }

}
