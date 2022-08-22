class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        
        while(low <high){
            int mid=low+(high -low)/2;
            if(nums[mid] <= nums[high]){
                high=mid;   //high =mid-1 not possible coz in case if mid is the one smallest then we are leaving it out from search space
            }
            else{
                low=mid+1;
            }
        }
        return nums[low];
    }
}