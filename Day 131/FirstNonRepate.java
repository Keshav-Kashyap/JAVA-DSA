import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepate {

    public static void firstNonRepeate(String str) {

        int map[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            map[ch - 'a']++;
            while (!q.isEmpty() && map[q.peek() - 'a'] > 1) {
                q.remove();

            }

            if (q.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(q.peek() + " ");
            }

        }

    }

    public static void main(String[] args) {
        String str = "aabccxb";
        firstNonRepeate(str);
    }
}