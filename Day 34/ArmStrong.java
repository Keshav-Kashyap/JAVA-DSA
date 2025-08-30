import java.util.Scanner;

public class ArmStrong {
    public static boolean cheakArmStrong(int num) {

        int lastDigit = 0, sum = 0, orignal = num;
        while (num != 0) {

            lastDigit = num % 10;
            sum += (lastDigit * lastDigit * lastDigit);
            num /= 10;

        }

        if (sum == orignal) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num = sc.nextInt();
        System.out.println(cheakArmStrong(num));

    }
}
