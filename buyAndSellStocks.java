public class buyAndSellStocks {

     public static int buyAndSellStocks(int prices[]) {
          int maxProfit = 0;
          int buyPrice = Integer.MAX_VALUE;

          for (int i = 0; i < prices.length; i++) {
               if (buyPrice < prices[i]) {
                    int profit = prices[i] - buyPrice; // Today's profit
                    maxProfit = Math.max(maxProfit, profit); // Update Today's profit
               } else {
                    buyPrice = prices[i];
               }
          }
          return maxProfit;
     }

     public static void main(String[] args) {
          int prices[] = { 7, 1, 5, 3, 6, 4 };
          System.out.println(buyAndSellStocks(prices));
     }
}
