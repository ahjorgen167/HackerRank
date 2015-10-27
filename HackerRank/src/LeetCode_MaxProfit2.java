import java.util.*;

public class LeetCode_MaxProfit2 {

	public static void main(String[] args){
		
	
	}
	
	public static int maxProfit(int[] prices){
        if(prices.length <= 1){
            return 0;
        }
        
        int totalMaxProfit = 0, currentMax = 0;
		int buyPrice = prices[0], sellPrice = 0;
		
		for(int i = 1; i < prices.length; i++){
		    
		    
		    if(prices[i] - buyPrice > currentMax){
		        
		        sellPrice = prices[i];
		        currentMax =  sellPrice - buyPrice;
		        
		    } else {
		         
		        totalMaxProfit += currentMax;
		        sellPrice = 0;
		        buyPrice = prices[i];
		        currentMax = 0;
		        
		    }
		    
		    
		}
		
		
		if(currentMax > 0){
		    totalMaxProfit += currentMax;
		}
		return totalMaxProfit;
	}
	
}
