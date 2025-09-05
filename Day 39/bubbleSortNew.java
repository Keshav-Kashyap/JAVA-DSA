public class bubbleSortNew {

    public static void main(String[] args) {

        int arr[] = { 5, 4, 1, 3, 2 };
        int temp = 0;

        for (int turn = 0; turn < arr.length - 1; turn++) {

            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                }
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}