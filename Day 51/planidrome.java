import java.util.*;

public class planidrome {

    public static boolean checkPalindrome(String str) {
        int n = str.length();
        System.out.println("Length : " + n);
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = sc.nextLine();

        System.out.println(checkPalindrome(str));

    }
}