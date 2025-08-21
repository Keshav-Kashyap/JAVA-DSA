import java.util.Scanner;

public class Revers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number:");
        int num = sc.nextInt();
        int i, reversNum = 0, lastDigit = 0;

        // 123
        while (num > 0) {

            lastDigit = num % 10;// 1
            num = num / 10;// 0
            reversNum = reversNum * 10 + lastDigit; // reversNum = 5 + lastDigit = 1 => 3+0 = 6 but hame ise store nhi
                                                    // karna -> 321 3*10 30+2 32*10 320+1 321
        }
        System.out.println(" Reverse is " + reversNum);

    }
}