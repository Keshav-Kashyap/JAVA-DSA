import java.util.Arrays;

public class anagramString {

    public static boolean Anagram(String str1, String str2) {

        // use to string.toCharArray()

        if (str1.length() != str2.length()) {
            return false;
        }

        char arr1[] = str1.toCharArray();
        char arr2[] = str1.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }

    public static void main(String[] args) {

        String str1 = new String("race");
        String str2 = new String("care");
        System.out.println(Anagram(str1, str2));

    }
}
