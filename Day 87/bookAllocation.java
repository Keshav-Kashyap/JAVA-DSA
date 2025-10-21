public class BookAllocation {

    public static boolean isPossible(int[] pages, int n, int m, int mid) {
        int studentCount = 1;
        int pageSum = 0;

        for (int i = 0; i < n; i++) {
            if (pages[i] > mid)
                return false;

            if (pageSum + pages[i] > mid) {
                studentCount++;
                pageSum = pages[i];
                if (studentCount > m)
                    return false;
            } else {
                pageSum += pages[i];
            }
        }

        return true;
    }

    public static int allocateBooks(int[] pages, int n, int m) {
        if (m > n)
            return -1; // more students than books → not possible

        int start = 0;
        int sum = 0;
        for (int page : pages)
            sum += page;

        int end = sum;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(pages, n, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] pages = { 12, 34, 67, 90 };
        int n = pages.length;
        int m = 2;

        System.out.println("Minimum Maximum Pages " + allocateBooks(pages, n, m));
    }
}
