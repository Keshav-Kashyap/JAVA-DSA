
import java.util.Arrays;

public class knapSack {

    public static double MaxProfitWithRatio(int capacity, Item[] items) {
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));
        double totalProfit = 0;
        for (Item item : items) {
            if (item.weight <= capacity) {
                capacity -= item.weight;
                totalProfit += item.profit;
            } else {
                totalProfit += capacity * ((double) item.profit / item.weight);
                break;
            }
        }
        return totalProfit;

    }

    public static void main(String[] args) {

        Item[] items = {
                new Item(45, 3),
                new Item(30, 5),
                new Item(45, 9),
                new Item(10, 6),
        };

        System.out.println(MaxProfitWithRatio(16, items));

    }
}

class Item {
    int profit;
    int weight;
    double ratio;

    public Item(int profit, int weight) {
        this.profit = profit;
        this.weight = weight;
        this.ratio = (double) profit / weight;
    }

}