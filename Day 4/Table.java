import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Table Number :");
        int table = sc.nextInt();
        int digit = 0;
        System.out.println("Your table:");
        for (int i = 1; i <= 10; i++) {
            digit = table * i;
            System.out.println(digit);
        }
    }
}
