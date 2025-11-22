public class selectionSort {

    public static void bubblesort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }
            }

        }

    }

    public static void printArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {

        int arr[] = { 3, 2, 4, 5, 1 };
        bubblesort(arr);
        printArr(arr);

    }
}