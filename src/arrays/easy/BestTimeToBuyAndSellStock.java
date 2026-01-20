package arrays.easy;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;  // Update best buy option
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }
    public static int maxProfitBrute(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                max = Math.max(max, prices[j] - prices[i]);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] p1 = {7,1,5,3,6,4};
        System.out.println(maxProfit(p1)); // 5

        int[] p2 = {7,6,4,3,1};
        System.out.println(maxProfit(p2)); // 0

        int[] p3 = {2,4,1};
        System.out.println(maxProfit(p3)); // 2
    }
}
