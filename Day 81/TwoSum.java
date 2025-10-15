public class TwoSum {

    public static void twoSum(int arr[], int target) {

        int i = 0;
        int j = arr.length - 1;
        int idxArr[] = new int[2];

        while (i < j) {
            if (arr[i] + arr[j] == target) {

                idxArr[0] = i;
                idxArr[1] = j;
                printArr(idxArr);
                return;
            } else if (arr[i] + arr[j] > target) {

                j--;
            } else {

                i++;
            }

        }

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 3, 3 };

        twoSum(arr, 6);

    }
}