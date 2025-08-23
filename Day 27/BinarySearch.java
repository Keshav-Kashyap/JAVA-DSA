
public class BinarySearch {

    public static int binarySearch(int arr[], int key) {

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                System.out.println("Something Is Wrong..");
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 9;
        int result = binarySearch(arr, key);
        if (result >= 0) {
            System.out.println("Founded at " + result);
        } else {
            System.out.println("Not Founded");
        }

    }

}
