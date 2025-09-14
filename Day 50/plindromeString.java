import java.util.Scanner;

public class plindromeString {

    public static boolean plandirom(String str) {

        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr = revStr + str.charAt(i);

        }

        System.out.println(revStr);

        if (revStr.equals(str)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(plandirom(str));

    }
}