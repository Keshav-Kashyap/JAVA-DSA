public class repeatInArray {

    public static boolean repeatFind(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        return true;
                    }
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 1, 1, 3, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(repeatFind(arr));

    }
}