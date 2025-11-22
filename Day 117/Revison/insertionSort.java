public class insertionSort {

    public static void insertion(int arr[]) {

        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            // define key and the index -1
            int key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

        }

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 6, 3, 4, 2, 1 };
        insertion(arr);

        printArr(arr);
    }

}
