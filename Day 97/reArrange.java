public class reArrange {
    public static void main(String[] args) {

        int nums[] = { 3, 1, -2, -5, 2, -4 };
        int newNums[] = new int[nums.length];
        int pos = 0, neg = 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {
                newNums[pos] = nums[i];
                pos += 2;
            } else {
                newNums[neg] = nums[i];
                neg += 2;
            }

        }

        for (int i = 0; i < newNums.length; i++) {
            System.out.println(newNums[i]);
        }

    }
}