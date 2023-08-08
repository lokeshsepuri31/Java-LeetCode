public class Easy121 {
    public int maxProfit(int[] prices) {
        if(prices.length == 1){
            return 0;
        }
        int min = prices[0], max = prices[1];
        int j = 0, k = 1;
        for (int i = 1; i < prices.length; i++) {
            if (min >= prices[i] && k >= i) {
                min = prices[i];
                j = i;
                continue;
            }
            if (max <= prices[i] && j <= i) {
                max = prices[i];
                k = i;
                continue;
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        int[] prices = {2,1,2,1,0,1,2};
        Easy121 easy121 = new Easy121();
        System.out.println(easy121.maxProfit(prices));
    }
}
