public class singleElement {

    public static int findIdx(int nums[]) {

        int si = 0;
        int ei = nums.length - 1;

        while (si >= ei) {

            int mid = si + (ei - si) / 2;

            // handling the first case then , do not check the -1 index (out of index error
            // ko khatam karegaa)
            if (mid == 0 && nums[mid + 1] != nums[mid]) {
                return mid;
            }
            // handling the last case then , do not check the lastIndex+1 (out of index
            // error ko khatam karegaa)

            if (mid == nums.length && nums[mid - 1] != nums[mid]) {
                return mid;
            }

            if (nums[mid - 1] != nums[mid] && nums[mid + 1] != nums[mid]) {

                return mid;

            }

            // now kis part main jana hai

            if (mid % 2 == 0) {

                // jidar match karega udhar odd ban jaayeag
                if (nums[mid - 1] == mid) {
                    ei = mid - 1;
                } else {
                    si = mid + 1;
                }

            } else {

                if (nums[mid - 1] == mid) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 1, 2, 3, 3, 6, 6, 7, 7 };

        System.out.println(findIdx(arr));

    }
}