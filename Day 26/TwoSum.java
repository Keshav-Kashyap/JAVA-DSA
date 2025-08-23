public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + arr[i + 1];
            if (sum == target) {
                System.out.println();
                break;
            }
        }

    }
}
