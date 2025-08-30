import java.util.Scanner;

public class ArmStrong {
    public static int cheakArmStrong(int num) {

        int lastDigit = 0, rev = 0;
        while (num != 0) {

            lastDigit = num % 10;

            num /= 10;

        }

        return rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter Your Number");
        System.out.println(cheakPlandirome(num));

    }
}
