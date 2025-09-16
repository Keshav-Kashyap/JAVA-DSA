import java.util.*;

public class largestString {

    public static void findLargestString(String fruits[]) {

        String largest = fruits[0];
        for (int i = 0; i < fruits.length - 1; i++) {
            if (fruits[i].compareToIgnoreCase(fruits[i + 1]) < 0) {
                largest = fruits[i + 1];
            }
        }
        System.out.println(largest);

    }

    public static void main(String[] args) {

        String fruits[] = { "apple", "mango", "banana" };

        findLargestString(fruits);
    }

}
