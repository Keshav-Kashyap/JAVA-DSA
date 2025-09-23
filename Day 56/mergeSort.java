
import java.util.*;

public class mergeSort {

    public static void merge(int arr[], int start, int mid, int end) {

        ArrayList<Integer> list = new ArrayList<>();

        int i = start, j = mid + 1;
        while (i <= mid && j <= end) {

            if (arr[i] < arr[j]) {
                list.add(arr[i]);
                i++;
            } else {
                list.add(arr[j]);
                j++;
            }

        }

        // jo bache hai unko direct copy kardo
        // kis jagay bache hai like i and j main to iusliye dono ke liye lga diya hai
        // jiske bhi bache se bo aajaye direct
        while (i <= mid) {
            list.add(arr[i]);
            i++;
        }

        while (j <= end) {
            list.add(arr[j]);
            j++;
        }

        for (int idx = 0; idx < list.size(); idx++) {
            arr[idx + start] = list.get(idx);
        }

    }

    public static void mergesort(int arr[], int start, int end) {

        if (start < end) {

            int mid = start + (end - start) / 2;

            // left
            mergesort(arr, start, mid);
            // right
            mergesort(arr, mid + 1, end);

            merge(arr, start, mid, end);

        }

    }

    public static void main(String[] args) {

        int arr[] = { 12, 31, 35, 8, 32, 17 };

        mergesort(arr, 0, arr.length - 1);

        for (int val : arr) {
            System.out.println(val);
        }
    }

}