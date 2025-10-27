public class subset {

    public static void findSubset(String str, String ans, int i) {

        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        // yes choice

        findSubset(str, ans + str.charAt(i), i + 1);

        findSubset(str, ans, i + 1);

    }

    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, "", 0);
    }
}