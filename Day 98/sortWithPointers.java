public class sortWithPointers {

    public static void sortPointers(int nums[]) {
        int l = 0, m = 0, h = nums.length - 1;

        while (m <= h) {

            if (nums[m] == 0) {
                int temp = nums[m];
                nums[m] = nums[l];
                nums[l] = temp;
                m++;
                l++;
            } else if (nums[m] == 1) {
                m++;
            } else if (nums[m] == 2) {
                int temp = nums[m];
                nums[m] = nums[h];
                nums[h] = temp;
                m++;
                h--;
            }
        }

    }

    public static void printnums(int nums[]) {

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }

    public static void main(String[] args) {

        int nums[] = { 0, 2 };
        sortPointers(nums);
        printnums(nums);

    }

}