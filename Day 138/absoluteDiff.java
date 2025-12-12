import java.util.*;

public class absoluteDiff {

    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int sum = 0;

        for (int i = 0; i < nums1.length; i++) {
            sum = Math.abs(Math.abs(sum) - Math.abs(nums1[i] - nums2[i]));
        }

        return Math.abs(sum);

    }

    public static int minimumAbs(int A[], int B[]) {

        Arrays.sort(A);
        Arrays.sort(B);
        int sum = 0;
        for (int i = 0; i < A.length; i++) {

            sum += Math.abs(A[i] - B[i]);

        }
        return sum;

    }

    public static void main(String[] args) {

        int A[] = { 1, 7, 5 };
        int B[] = { 2, 3, 5 };

        System.out.println(minimumAbs(A, B));
        System.out.println(minAbsoluteSumDiff(A, B));

    }

}