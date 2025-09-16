import java.util.*;

public class upperCase {

    public static void ConvertUpperCase(StringBuilder str) {

        StringBuilder newStr = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                char ch = Character.toUpperCase(str.charAt(i));
                newStr.append(ch);
                continue;
            }

            if (str.charAt(i) == ' ' && i + 1 < str.length()) {
                newStr.append(' ');

                char ch2 = Character.toUpperCase(str.charAt(i + 1));
                newStr.append(ch2);
                i++;

            } else {
                newStr.append(str.charAt(i));
            }
        }

        System.out.println(newStr);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // StringBuilder str = sc.next();
        String inp = sc.nextLine();

        StringBuilder str = new StringBuilder(inp);

        ConvertUpperCase(str);

    }

}