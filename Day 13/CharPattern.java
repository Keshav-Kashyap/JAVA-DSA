import java.util.Scanner;

public class CharPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Range:");
        int range = sc.nextInt();
        // int value = 65;
        char ch = 'A';

        for (int i = 1; i <= range; i++) {
            for (int j = 1; j <= i; j++) {
                // char ch = (char) value;
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }

}
