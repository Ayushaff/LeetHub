class Solution {
    public int searchInsert(int[] nums, int tar) {
            int high=nums.length-1, low=0;
            
            while(low<=high){
            int mid=low+(high-low)/2;
                    if(nums[mid]==tar)
                            return mid;
                    else if(nums[mid]>tar)
                        high=mid-1;
                    else 
                            low=mid+1;
                    }
            return low;
    }
}
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
//         int n=nums.length;
//         int mid=0;
//         int lo=0;
//         int hi=n-1;
//         while(lo<=hi){
            
//             mid=lo+(hi-lo)/2;
            
//         if(nums[mid]==tar)return mid;
            
//             else if(nums[mid]<tar)lo=mid+1;
            
//             else hi=mid-1;
            
//         }
//         return lo;
