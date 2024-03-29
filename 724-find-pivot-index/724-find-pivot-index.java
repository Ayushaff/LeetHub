class Solution {
    public int pivotIndex(int[] nums) {
        int lsum=0,rsum=0 ,tsum=0 ,n=nums.length;
        
        if(n==1) return 0;
        for(int i=0;i<n;i++) tsum+=nums[i];
        
        for(int i=0;i<n;i++){
            if(lsum==(tsum-lsum-nums[i])){
                return i;
            }
            lsum+=nums[i];
        }
        return -1;
    }
}