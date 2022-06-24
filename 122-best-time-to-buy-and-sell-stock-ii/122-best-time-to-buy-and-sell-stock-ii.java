class Solution {
    public int maxProfit(int[] a) {
        int profit=0;
        for(int i=1;i<a.length;i++){
            if(a[i]>a[i-1]){
                int p=a[i]-a[i-1];
                profit+=p;
            }
        }
                    return profit;

    }
}

/*class Solution {
    public int maxProfit(int[] prices) {
        int profit=0,maxProfit=0,minSofar=0;
        for(int i=0;i<prices.length;i++){
            minSofar=Math.min(minSofar,prices[i]);
            profit=prices[i]-minSofar;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}*/