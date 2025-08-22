public class SecondLargest {
    public static void main(String[] args) {

        int arr[] = { 5, 5, 6, 5, 5, 5 };
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                secLargest = largest;
                largest = arr[i];

            } else if (secLargest < arr[i] && arr[i] != largest) {
                secLargest = arr[i];
            }

        }

        if (secLargest == Integer.MIN_VALUE) {
            System.out.println("No Any Second Largest Number Exists!!");
        } else {
            System.out.println(secLargest);
        }

    }
}