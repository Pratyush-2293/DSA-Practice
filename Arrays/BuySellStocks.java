import java.util.*;

public class BuySellStocks {
    public static void main(String args[]){
        int numbers[] = {7,1,5,3,6,4};
        System.out.println("Maximum profit is: "+BuySellProfit(numbers));
    }

    public static int BuySellProfit(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
}
