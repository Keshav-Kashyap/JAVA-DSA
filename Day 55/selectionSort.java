public class selectionSort {

    public static void selection(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            int min = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[min]) {
                    min = j;

                }

            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 3, 5, 2, 1, 4 };
        printArray(arr);

        selection(arr);
        System.out.println();
        printArray(arr);

    }

}