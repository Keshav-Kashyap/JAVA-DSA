import java.util.Scanner;

public class oddSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();

        int count = 0, num = 1;

        while (count < range) {
            System.out.println(num);
            count++;
            num += 2;

        }

    }

}
