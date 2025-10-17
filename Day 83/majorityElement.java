class majorityElement {

    public static int majorityElement(int[] nums) {

        int counter = 0;
        int majority = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == majority) {

                counter++;

            } else {
                if (counter == 0) {
                    majority = nums[i];
                    counter++;
                } else {
                    counter--;
                }
            }

        }
        return majority;

    }

    public static void main(String[] args) {

        int arr[] = { 2, 2, 1, 1, 2, 2, 1, 1, 1, 2, 1 };
        System.out.println(majorityElement(arr));

    }

}