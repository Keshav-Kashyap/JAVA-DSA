public class mergeSort {

    public static void mergeSort(int arr[], int start, int end) {

        if (start < end) {
            int mid = start + (end - start) / 2;
            // left part ko dived karna hai poora
            mergeSort(arr, start, mid);

            // right part ki bari

            mergeSort(arr, mid + 1, end);

        }

    }

    public static merge(int arr[], int start){
        
        
    }

    public static void main(String[] args) {

    }
}