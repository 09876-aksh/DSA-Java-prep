package arrays;

public class BestTimeToButSellStock {

    public static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            // Step 1: track minimum buying price
            if (price < minPrice) {
                minPrice = price;
            }

            // Step 2: calculate profit if sold today
            int profit = price - minPrice;

            // Step 3: update maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
    }
}


