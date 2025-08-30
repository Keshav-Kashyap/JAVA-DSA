import java.util.Scanner;

public class plandirome {

    public static boolean cheakPlandirome(int num) {

        int lastDigit = 0, rev = 0, orignal = num;
        while (num != 0) {

            lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num /= 10;

        }

        if (rev == orignal) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num = sc.nextInt();

        System.out.println(cheakPlandirome(num));

    }
}