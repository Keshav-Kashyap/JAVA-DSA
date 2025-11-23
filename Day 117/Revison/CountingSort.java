public class CountingSort {

    public static int maxValue(int arr[]) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }

        return max;

    }

    public static void countingSort(int arr[]) {

        int n = arr.length;
        int max = maxValue(arr);
        int count[] = new int[max + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for(int i = 1 i<=max;i++){
            count[i] =count[i]+count[i-1];
        }


    }

    public static void main(String[] args) {

        int arr[] = { 5, 2, 3, 1, 4, 6 };

    }
}
