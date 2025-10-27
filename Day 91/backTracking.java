public class backTracking {

    public static void MakeArray(int arr[], int i) {

        if (i == arr.length) {
            printArr(arr);
            return;
        }

        arr[i] = i + 1;

        MakeArray(arr, i + 1);

        // backTracking
        arr[i] = arr[i] - 2;

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = new int[5];

        MakeArray(arr, 0);
        printArr(arr);
    }

}
