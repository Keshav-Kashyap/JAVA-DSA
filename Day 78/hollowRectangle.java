import java.util.Scanner;

public class hollowRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length:");
        int length = sc.nextInt();
        System.out.println("Enter Breadth:");
        int breadth = sc.nextInt();

        for (int i = 0; i < breadth; i++) {
            for (int j = 0; j < length; j++) {

                if (i == 0 || j == 0 || i == breadth - 1 || j == length - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}