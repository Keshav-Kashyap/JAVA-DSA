import java.util.*;

public class StringCompression {

    // public static void stringComp(StringBuilder str) {
    // StringBuilder newStr = new StringBuilder("");

    // for (int i = 0; i < str.length(); i++) {

    // char ch = str.charAt(i);
    // int count = 0;
    // while (str.charAt(i) == ch) {
    // count++;
    // i++;
    // }
    // if (count > 1) {
    // newStr.append(ch + count);

    // }

    // }

    // System.out.println(newStr);

    // }

    public static void main(String[] args) {

        String inp = "aaabbcccdd";
        StringBuilder str = new StringBuilder(inp);

        // stringComp(str);

        int count = 2;
        char ch = 'a';
        StringBuilder strNew = new StringBuilder("");
        strNew.append(ch + count);
        System.out.println(strNew);
    }

}