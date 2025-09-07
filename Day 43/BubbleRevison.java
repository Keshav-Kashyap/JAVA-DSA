public class BubbleRevison {

    public static void BubbleSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }

    }

    public static void print(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 5, 4, 1, 2, 3 };
        BubbleSort(arr);
        print(arr);

    }

}