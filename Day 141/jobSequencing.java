
import java.util.*;

public class jobSequencing {

    static class Job {
        int deadline;
        int profit;
        int idx;

        public Job(int deadline, int profit, int idx) {
            this.deadline = deadline;
            this.profit = profit;
            this.idx = idx;

        }

    }

    public static void main(String[] args) {

        int[][] jobsInfo = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {

            jobs.add(new Job(jobsInfo[i][0], jobsInfo[i][1], i));

        }

        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        int time = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < jobs.size(); i++) {

            Job curr = jobs.get(i);

            if (curr.deadline > time) {

                list.add(curr.idx);
                time++;

            }

        }

        System.out.println(list.size());
        System.out.println(list);

    }

}
