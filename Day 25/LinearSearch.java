import java.util.Scanner;

public class LinearSearch {

    public static void setter(int arr[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element No." + (i + 1) + ": ");
            arr[i] = sc.nextInt();

        }
    }

    public static void getter(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void linearSearch(int arr[], int key) {

        boolean check = false;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                check = true;
                index = i;
                break;
            }
        }

        if (check == true) {
            System.out.println();
            System.out.println("Key Founded Succesfully at Index " + index);

        } else {
            System.out.println("Key not found");
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        setter(arr);
        System.out.println("Your Array Is:");
        getter(arr);
        linearSearch(arr, 4);

    }

}
