public class QuicckSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[], int si, int ei) {

        // base case
        if (si >= ei) {
            return;
        }

        // kaam kar lun matlv partition
        int pivIdx = partition(arr, si, ei);
        quickSort(arr, si, pivIdx - 1);// for left
        quickSort(arr, pivIdx + 1, ei);// for right

    }

    public static int partition(int arr[], int si, int ei) {

        int piv = arr[ei];

        int i = si - 1;

        for (int j = si; j < ei; j++) {

            if (arr[j] <= piv) {
                i++;
                // swaping
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }

        }

        i++;

        int temp = piv;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);

    }

}
