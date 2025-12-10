import java.util.*;

public class activitySelectionCode {

    public static int activitySelect(int[] start, int[] end, ArrayList<String> list) {

        int count = 1;
        list.add("A0");
        int lastend = end[0];

        for (int i = 1; i < start.length; i++) {
            if (start[i] >= lastend) {
                count++;
                list.add("A" + i);
                lastend = end[i];

            }
        }

        return count;

    }

    public static void activity(int[] start, int[] end, ArrayList<String> list) {

        int activites[][] = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            activites[i][0] = i;
            activites[i][1] = start[i];
            activites[i][2] = end[i];

        }

        //lamda funx-> 
        Arrays.sort(activites, Comparator.comparingDouble(o -> o[2]));

    }

    public static void main(String[] args) {

        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };
        ArrayList<String> list = new ArrayList<>();
        System.out.println(activitySelect(start, end, list));
        System.out.println(list);

    }

}