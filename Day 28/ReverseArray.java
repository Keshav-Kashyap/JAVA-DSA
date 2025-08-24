public class ReverseArray {
    public static void main(String[] args) {

        int arr[] = { 5, 6, 8, 7, 5, 6 };
        int revArr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            revArr[i] = arr[arr.length - i - 1];
        }
        for (int i = 0; i < revArr.length; i++) {
            System.out.println(revArr[i]);
        }

    }
}
