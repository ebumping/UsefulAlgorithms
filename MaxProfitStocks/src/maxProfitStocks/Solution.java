package maxProfitStocks;

public class Solution {
    public int maxProfit(int[] prices) {

        int buy = prices[0], sell = prices[0];
        for(int i = 0; i < prices.length; i++) {
        						  //this middle condition is ruining things
        	//if(prices[i] < buy && prices[i] != prices[prices.length - 1] && prices[i] != 0) {
        	if(prices[i] < buy && i != prices.length - 1 && prices[i] != 0) {
        		buy = prices[i];
        		sell = prices[i];
        	}else if(prices[i] > sell && i != 0) {
        		sell = prices[i];
        	}
        	System.out.println(buy + " " + sell);
        }   	
    	return sell - buy;  
    	
    	//int buy = Integer.MAX_VALUE;
    }
   
    public static void main(String[] args) {
    	int[] prices = {7,6,4,3,1};
    	int[] prices2 = {7,1,5,3,6,4};
    	int[] prices3 = {3,2,6,5,0,3};
    	int[] prices4 = {2,1,2,0,1};
    	int[] prices5 = {2,1,2,1,0,1,2};
    	Solution s = new Solution();
    	//s.maxProfit(prices);
    	//s.maxProfit(prices);
    	System.out.println(s.maxProfit(prices5));
    }
}
