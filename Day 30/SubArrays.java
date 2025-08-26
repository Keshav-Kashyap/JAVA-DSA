
public class SubArrays {

    public static void subArrays(int arr[]) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.println(arr[k] + " ");
                }
                System.out.println();

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 6, 8, 10 };
        subArrays(arr);

    }
}
