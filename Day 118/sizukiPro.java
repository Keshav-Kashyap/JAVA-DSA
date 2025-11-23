public class sizukiPro {

    public static int findConf(int n) {

        if (n <= 0) {
            return 1;
        }

        return findConf(n - 2) + findConf(n - 4);
    }

    public static void main(String[] args) {
        System.out.println(findConf(4));

    }

}
