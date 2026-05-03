package array;

import java.util.Arrays;

public class Buy_Sell_Stock {

    public static void main(String[] args) {

        int arr[] = {24,3,1,6,765,64};
        int maxProfit=0;
        int minPrice= Integer.MAX_VALUE;

        for(int price: arr){
            if(price < minPrice ){
                minPrice = price;  // buy
            }
            else {
                int profit= price - minPrice; // sell
                maxProfit = Math.max(maxProfit,profit);
            }
        }
        System.out.println("Max Profit: " + maxProfit);
    }
}
