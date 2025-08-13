
public class InvertedNumbers {

    public static void NumbersPyramid(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j <= n - i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        NumbersPyramid(5);
    }

}
