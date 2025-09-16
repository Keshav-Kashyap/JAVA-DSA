import java.util.*;

public class subString {

    public static void SubString(String str, int startIdx, int endIdx) {

        if (endIdx > str.length()) {
            System.out.println("can not possible");
            return;
        }

        String sub = "";

        for (int i = startIdx; i < endIdx; i++) {

            sub += str.charAt(i);

        }
        System.out.println(sub);

    }

    public static void main(String[] args) {

        String str = "hello world";
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Start Point");

        // int startIdx = sc.nextInt();
        // System.out.println("Enter End Point");
        // int endIdx = sc.nextInt();

        // SubString(str, startIdx, endIdx);

        // Built in Funxtion
        System.out.println(str.substring(0, 5));

    }
}