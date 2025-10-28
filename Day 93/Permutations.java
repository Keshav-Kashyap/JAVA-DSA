public class Permutations {

    public static void findPer(String str, String ans, int i, int counter) {

        if (i == str.length()) {

            System.out.println(ans);
            return;

        }

        findPer(str, ans + str.charAt(i), i + 1, counter - 1);

        if (counter > 1) {

            findPer(str, ans, i + 2, counter);

        }

    }

    public static void main(String[] args) {

        String str = "abc";
        findPer(str, "", 0, str.length());

    }
}