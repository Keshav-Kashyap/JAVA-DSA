public class SearchInRotate {

    public static int modifeidBinarySearch(int arr[], int si, int ei, int target) {

        if (si > ei)
            return -1;

        int mid = (si + ei) / 2;
        int idx = -1;
        if (arr[mid] == target) {
            return mid;
        }

        // Line one ke liye
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target <= arr[mid]) {
                idx = modifeidBinarySearch(arr, si, mid - 1, target);
            } else {
                idx = modifeidBinarySearch(arr, mid + 1, ei, target);
            }
        }
        // Line two ke liye
        else {
            if (arr[mid] <= target && target <= arr[ei]) {
                idx = modifeidBinarySearch(arr, mid + 1, ei, target);
            } else {
                idx = modifeidBinarySearch(arr, si, mid - 1, target);
            }
        }

        return idx;

    }

    public static void main(String[] args) {

        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };

        System.out.println(modifeidBinarySearch(arr, 0, arr.length - 1, 1));
    }
}