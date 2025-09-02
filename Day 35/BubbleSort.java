public class BubbleSort {

    public static void bubbleSort(int arr[]) {

        for (int i = 0; i <= arr.length; i++) {

            if (arr[i] < arr[i + 1]) {

                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

            }

        }

        bubbleSort(arr);

    }

    public static void main(String[] args) {

        int arr[] = { 4, 5, 3, 7, 1, 2 };

    }
for (ggng var : iterable) {
    
}ggnbm,nddl