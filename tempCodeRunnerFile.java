class Solution {
    public int maxProfit(int[] prices) {
        int minNum = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(minNum > prices[i]){
                minNum = prices[i];
            }
            else if(maxProfit < prices[i] - minNum){
                maxProfit = prices[i] - minNum;
            }
        }
        return maxProfit;
        
    }
}