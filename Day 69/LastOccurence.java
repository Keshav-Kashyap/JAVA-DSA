public class LastOccurence {

    public static int Last(int arr[], int key, int i) {

        if (i > 0) {

            return -1;
        }

        if (arr[i] == key) {

            return i;

        }

        return Last(arr, key, i - 1);

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 3, 5 };
        System.out.println(Last(arr, 3, 7));

    }

}