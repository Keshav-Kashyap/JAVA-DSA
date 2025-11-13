import java.util.ArrayList;

public class pairSum2 {

    public static void findPairs(ArrayList<Integer> list, int target) {

        int rp = 0;
        int lp = 0;
        int n = list.size();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                lp = i + 1;
                rp = i;
            }
        }

        while (lp != rp) {

            if (list.get(lp) + list.get(rp) == target) {
                System.out.println("[" + list.get(lp) + "," + list.get(rp) + "]");
                break;
            } else if (list.get(lp) + list.get(rp) > target) {
                rp = (n + rp - 1) % n;
            } else {
                lp = (lp + 1) % n;
            }
        }

    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);// this
        list.add(8);
        list.add(9);
        list.add(10);// this
        findPairs(list, 16);
    }
}
