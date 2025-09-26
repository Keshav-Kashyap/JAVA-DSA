import java.util.*;

public class abcd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number:");
        int n = sc.nextInt();
        int count = 0;
        for (char i = 'A'; i <= 'Z'; i++) {
            count++;
            if (count == n) {
                System.out.println(i);
            }
        }

    }
}
