import java.util.Scanner;

public class checkPerfectSqaure {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean check = false;
        int sqrt = 0;
        for (int i = 2; i < n / 2; i++) {

            if (i * i == n) {

                check = true;
                sqrt = i;

                break;

            }

        }
        System.out.println("Yes!! This is a perfect sqaurea and its sqaure root is " + sqrt);

    }

}
