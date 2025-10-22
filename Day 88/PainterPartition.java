public class PainterPartition {

    public static boolean isPossible(int[] boards, int k, int mid) {
        int painterCount = 1;
        int timeSum = 0;

        for (int board : boards) {
            if (timeSum + board <= mid) {
                timeSum += board;
            } else {
                painterCount++;
                if (painterCount > k || board > mid)
                    return false;
                timeSum = board;
            }
        }
        return true;
    }

    public static int minTimeToPaint(int[] boards, int k) {
        int start = 0, end = 0;

        for (int b : boards) {
            end += b;
            start = Math.max(start, b);
        }

        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(boards, k, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] boards = { 10, 20, 30, 40 };
        int k = 2;
        System.out.println("Minimum time to paint: " + minTimeToPaint(boards, k));
    }
}
