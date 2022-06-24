class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int maxProfit=0;
        int minSofar=prices[0];
        for(int i=0;i<prices.length;i++){
            minSofar=Math.min(minSofar,prices[i]);
            profit=prices[i]-minSofar;
            maxProfit=Math.max(maxProfit, profit);
        }
        return maxProfit;   
    }
}