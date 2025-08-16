import java.util.Scanner;

public class random {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 20;
        int range = b - a + 1;// 11

        double randomDecimal = Math.random();// 0.0 to 1.0 lets -> 0.5

        double scaledValue = randomDecimal * range;// 5.5
        int randomNumber = (int) scaledValue;// 5
        int finalRandom = randomNumber + a;// 10+5 = 15

        System.out.println("Your random number b/w" + a + " and " + b + "is: " + finalRandom);

    }
}
