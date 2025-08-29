public class Buy_SellStock {

    public static int StockProfit(int prices[]) {

        int buyPrice = Integer.MAX_VALUE;
        int currProfit = 0, maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {

                currProfit = prices[i] - buyPrice;

                if (currProfit > maxProfit) {
                    maxProfit = currProfit;
                }

            } else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(StockProfit(prices));

    }
}