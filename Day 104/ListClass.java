import java.util.ArrayList;

public class ListClass {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // get operations o(1);
        // add operation o(1);
        System.out.println(list.get(2));
        // delete elemenet by index
        System.out.println(list);
        // set elemetn add index like idx 2 = 10
        list.set(2, 10);
        System.out.println(list);
        System.out.println(list.contains(10));
        System.out.println(list.contains(11));

        // new add
        list.add(1, 14);
        System.out.println(list);

        // size of Array list

        System.out.println(list.size());

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

    }

}