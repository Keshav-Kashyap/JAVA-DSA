import java.util.Arrays;

public class painterPartition {

    public static int PainterPar(int arr[], int m) {

        int si = 0;
        int ei = Arrays.stream(arr).sum();
        int ans = 0;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (isVaild(arr, mid, m)) {
                ans = mid;
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }

        return ans;
    }

    public static boolean isVaild(int arr[], int mid, int m) {

        int pt = 1, painTime = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > mid) {
                return false;
            }

            if (arr[i] + painTime <= mid) {
                painTime += arr[i];

            } else {
                pt++;
                painTime = arr[i];
            }

        }

        return pt <= m;

    }

    public static void main(String[] args) {

        int arr[] = { 4, 3, 1, 2 };

        System.out.println(PainterPar(arr, 2));

    }
}