import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class jobSequencing {

    public static void main(String[] args) {

        int[][] jobs = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        Arrays.sort(jobs, Comparator.comparingDouble(o -> o[1]));

        ArrayList<Integer> list = new ArrayList<>();
        int time = 0;

        for (int i = jobs.length - 1; i <= 0; i--) {

            if (time < jobs[i][0]) {
                list.add(jobs[i][1]);
                time += 1;
            }

        }

        System.out.println(list);

    }

}
