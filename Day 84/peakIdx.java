public class peakIdx {

    public static int FindPeak(int arr[]) {

        int si = 0;

        int ei = arr.length - 1;

        while (si < ei) {
            int mid = si + (ei - si) / 2;

            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid - 1] < arr[mid]) {
                si = mid + 1;

            } else {
                ei = mid;

            }

        }

        return si;

    }

    public static void main(String[] args) {

        int[] arr = { 0, 3, 8, 9, 5, 2 };
        System.out.println(FindPeak(arr));
    }
}
