import java.util.*;

public class StringCompression {

    public static void stringComp(StringBuilder str) {
        StringBuilder newStr = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {

            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i + 1) == str.charAt(i)) {
                count++;
                i++;
            }
            if (count > 1 && i < str.length()) {

                newStr.append(str.charAt(i) + count.toString());

            }

        }

        System.out.println(newStr);

    }

    public static void main(String[] args) {

        String inp = "aaabbcccdd";
        StringBuilder str = new StringBuilder(inp);

        stringComp(str);

    }

}