public class mergeSort {

    public static void mergSort(int arr[], int start, int end) {

        if (start >= end) {
            return;

        }

        int mid = start + (end - start) / 2;

        mergSort(arr, start, mid);
        mergSort(arr, mid + 1, end);

        merge(arr, start, mid, end);

    }

    public static void merge(int arr[], int start, int mid, int end) {

        int temp[] = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;// for temp array
        while (i <= mid && j <= end) {

            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }

        }

        while (i <= mid) {
            temp[k++] = arr[i++];// short hand brother short hand

        }

        while (j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (k = 0, i = start; k < temp.length; k++, i++) {
            arr[i] = temp[k];

        }

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 2, 7, 8, 3, 9, 4, 1, 6, 5, 10 };
        mergSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}