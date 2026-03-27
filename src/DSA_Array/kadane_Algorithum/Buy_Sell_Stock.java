package DSA_Array.kadane_Algorithum;

public class Buy_Sell_Stock {
// Best time to Buy and sell stock

    public static void main(String[] args){

        int[] prices = {7, 1, 5, 3, 6, 4};
        int minprice = Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0; i< prices.length;i++){
            if(prices[i] < minprice )
            {
                minprice = prices[i];
            }

            int profit = prices[i] - minprice;

            if(profit > maxprofit ){
                maxprofit = profit;
            }

        }
        System.out.println("maximum profit: "+  maxprofit);
    }
}
