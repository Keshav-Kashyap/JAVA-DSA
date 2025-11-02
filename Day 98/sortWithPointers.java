public class sortWithPointers {

    public static void sortPointers(int arr[]) {
        int l = 0, m = 0, h = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {

            if (m > h)
                break;
            if (arr[m] == 0) {
                int temp = arr[m];
                arr[m] = arr[l];
                arr[l] = temp;
                m++;
                l++;
            } else if (arr[m] == 1) {
                m++;
            } else if (arr[m] == 2) {
                int temp = arr[m];
                arr[m] = arr[h];
                arr[h] = temp;
                m++;
                h--;
            }
        }

    }

    public static void printArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {

        int arr[] = { 0, 1, 0, 1, 2, 0, 1 };
        sortPointers(arr);
        printArr(arr);

    }

}