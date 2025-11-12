import java.util.ArrayList;

public class TwoSum2 {

    public static boolean findPair(ArrayList<Integer> list, int target) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); i++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }

        return false;

    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(findPair(list, 5));

    }
}