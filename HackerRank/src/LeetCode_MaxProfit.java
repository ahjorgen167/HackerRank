import java.util.*;

public class LeetCode_MaxProfit {

	public static void main(String[] args){
		
	}
	
	public static int maxProfit(int[] prices){
		if(prices.length <= 1){
			return 0;
		}
		
		int currentMax = 0, totalMax = 0;
		int buyPrice = prices[0];
		
		for(int i = 1; i < prices.length; i++){
			
			
			if(prices[i] - buyPrice > currentMax){
				currentMax = prices[i] - buyPrice;
			} else {
				if(prices[i] < buyPrice)
					buyPrice = prices[i];
			}
			
			if(currentMax > totalMax){
				totalMax = currentMax;
			}
			
		}	
		return totalMax;
	}
}
