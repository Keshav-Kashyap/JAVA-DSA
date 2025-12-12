
import java.util.*;

public class knapSack {

    public static double fractionalKnapSack(int value[], int weight[], int W) {

        double ratio[][] = new double[value.length][2];
        double totalProfit = 0;
        for (int i = 0; i < value.length; i++) {

            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];

        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (W >= weight[idx]) {
                W = W - weight[idx];
                totalProfit = totalProfit + value[idx];

            } else {
                totalProfit = totalProfit + ratio[i][1] * W;
                W = 0;
                break;
            }

        }

        return totalProfit;

    }

    public static void main(String[] args) {

        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;
        System.out.println(fractionalKnapSack(value, weight, W));

    }

}