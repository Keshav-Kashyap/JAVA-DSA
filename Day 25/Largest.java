import java.util.*;

public class Largest {

    public static void setter(int arr[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element No." + (i + 1) + ": ");
            arr[i] = sc.nextInt();

        }
    }

    public static int getLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest <= arr[i]) {
                largest = arr[i];

            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        setter(arr);
        int largest = getLargest(arr);
        System.out.println(largest);

    }

}
