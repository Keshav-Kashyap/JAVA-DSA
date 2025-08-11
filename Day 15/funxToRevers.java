import java.util.Scanner;

public class funxToRevers {

    public static int revers(int num) {

        int reverseNum = 0, lastDigit = 0;
        while (num > 0) {

            lastDigit = num % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            num = num / 10;

        }

        return reverseNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = sc.nextInt();
        System.out.println(revers(num));

    }

}
