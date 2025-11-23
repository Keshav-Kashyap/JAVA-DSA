public class MergeSort {

    public static void mergeSort(int arr[], int si, int ei) {

        // base

        if (si >= ei) {
            return;
        }

        // kaam

        // 1. mid
        int mid = si + (ei - si) / 2;

        // 2. call for left
        mergeSort(arr, si, mid);

        // 3. call for right

        mergeSort(arr, mid + 1, ei);

        // 4.merging both

        merge(arr, si, ei, mid);

    }

    public static void merge(int arr[], int si, int ei, int mid) {

        int copy[] = new int[ei - si + 1];

        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                copy[k++] = arr[i++];
            } else {
                copy[k++] = arr[j++];
            }

        }

        while (i <= mid) {
            copy[k++] = arr[i++];
        }
        while (j <= ei) {
            copy[k++] = arr[j++];
        }

        for (k = 0, i = si; k < copy.length; k++, i++) {

            arr[i] = copy[k];
        }

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 5, 3, 2, 6, 1, 4 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }

}
