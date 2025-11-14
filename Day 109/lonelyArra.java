import java.util.*;


public class lonelyArra{


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 6, 5, 8, 9, 15));

        Collections.sort(list); 
        ArrayList<Integer> lonely = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int curr = list.get(i);

            boolean left = (i > 0 && Math.abs(curr - list.get(i - 1)) <= 1);
            boolean right = (i < list.size() - 1 && Math.abs(curr - list.get(i + 1)) <= 1);

            if (!left && !right) {
                lonely.add(curr);
            }
        }

        System.out.println("Lonely Numbers: " + lonely);
    }
}