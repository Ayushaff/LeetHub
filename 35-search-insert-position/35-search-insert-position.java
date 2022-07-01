class Solution {
    public int searchInsert(int[] nums, int tar) {
        int n=nums.length;
        int mid=0;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            mid=lo+(hi-lo)/2;
        if(nums[mid]==tar)return mid;
            else if(nums[mid]<tar)lo=mid+1;
            else hi=mid-1;
        }
        return lo;
    }
}