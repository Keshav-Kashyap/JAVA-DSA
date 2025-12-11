
import java.util.*;

public class knapSack {

    public static void fractionalKnapSack(int value[], int weight[], int W) {

        double ratio[][] = new int[value.length][2];
        double totalProfit = 0;
        for (int i = 0; i < value.length; i++) {

            ratio[i][0] = 1;
            ratio[i][2] = value[i] / (double) weight[i];

        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        for (int i = ratio.length - 1; i >= 0; i--) {

            if (W >= weight[i]) {
                W = W - weight[i];
                totalProfit = totalProfit + value[i];

            } else {
                totalProfit = totalProfit + ratio[i][1] * weight[i];
                break;
            }

        }

    }

    public static void main(String[] args) {

        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;
        fractionalKnapSack(value, weight, W);

    }

}