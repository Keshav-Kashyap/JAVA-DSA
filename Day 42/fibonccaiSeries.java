import java.util.Scanner;

public class fibonccaiSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Range:");
        int range = sc.nextInt();

        int first = 0;
        int second = 1;
        int next = 0;
        System.out.println(first);
        System.out.println(second);

        for (int i = 1; i <= range; i++) {
            next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }

    }

}