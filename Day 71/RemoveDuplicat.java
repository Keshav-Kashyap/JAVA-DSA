import java.util.*;

public class RemoveDuplicat {

    public static void DuplicatRemove(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        if (map[currChar - 'a'] == true) {
            // duplicate
            DuplicatRemove(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            DuplicatRemove(str, idx + 1, newStr.append(currChar), map);
        }

    }

    public static void main(String[] args) {

        String str = "appnnacollege";
        DuplicatRemove(str, 0, new StringBuilder(""), new boolean[26]);

    }

}