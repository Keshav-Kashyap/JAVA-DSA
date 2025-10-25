import java.util.Arrays;

public class bookAllocation {

    public static int bookAll(int arr[], int m) {

        int si = 0;
        int ei = Arrays.stream(arr).sum();
        int ans = 0;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (isVaild(mid, arr, m)) {
                ans = mid;
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }

        return ans;

    }

    public static boolean isVaild(int mid, int arr[], int m) {

        int st = 1, pages = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > mid) {
                return false;
            }

            if ((pages + arr[i]) <= mid) {

                pages += arr[i];
            } else {
                if (st < m) {
                    st++;
                    pages = arr[i];
                } else {
                    return false;
                }
            }

        }

        return true;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 1, 3, 4 };
        int m = 2;

        System.out.println(bookAll(arr, m));

    }
}