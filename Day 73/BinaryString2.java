import java.util.*;

public class BinaryString2 {

    public static void StringBinary(int n, int lastPlace, String str) {

        if (n == 0) {
            System.out.println(str);
            return;
        }

        StringBinary(n - 1, 0, str + "0");

        if (lastPlace == 0) {
            StringBinary(n - 1, 1, str + "1");

        }

    }

    public static void main(String[] args) {

        StringBinary(3, 0, "");

    }
}
