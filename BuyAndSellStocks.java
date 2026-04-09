public class BuyAndSellStocks {
    public static void CalcProfit(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int day = 0;

        for (int i = 0; i < price.length; i++) {
            if (price[i] > buyPrice) {
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
                day = i;
            } else {
                buyPrice = price[i];
            }
        }
        System.out.println("Max profit: " + maxProfit + " on day " + day);
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        CalcProfit(prices);
    }
}
