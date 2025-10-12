
public class QuickSort {

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pivIdx = partition(arr, si, ei);

        quickSort(arr, si, pivIdx - 1);
        quickSort(arr, pivIdx + 1, ei);

    }

    public static int partition(int arr[], int si, int ei) {
        int piv = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] < piv) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 6, 3, 4, 1, 2, 5 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
