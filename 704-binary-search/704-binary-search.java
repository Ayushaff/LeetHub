class Solution {
    public int search(int[] nums, int tar) {
        
        int n=nums.length;
        int mid=0;
        int start=0;
        int end=n-1; 
        
        while(start<=end){
            //mid=(start+end)/2;
            mid=start+(end-start)/2;
        
        
        if(nums[mid]==tar)return mid;
        
        else if(nums[mid]<tar)start=mid+1;
        
        else end =mid-1;
        }
             return -1;
    }
   
}