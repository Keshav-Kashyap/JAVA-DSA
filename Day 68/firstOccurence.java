public class firstOccurence {

    public static int checkKey(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return checkKey(arr, key, i + 1);

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4 };
        System.out.println(checkKey(arr, 4, 0));

    }

}
