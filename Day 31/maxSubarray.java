
public class maxSubarray {

    public static int MaxSubArray(int arr[]) {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    currSum = currSum + arr[k];

                }
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
                currSum = 0;

            }

        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, -2 };
        int result = MaxSubArray(arr);
        System.out.println(result);

    }
}
