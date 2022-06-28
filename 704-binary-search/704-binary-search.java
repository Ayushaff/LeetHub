class Solution {
    public int search(int[] nums, int tar) {
        
        int n=nums.length;
        int mid=0;
        int lo=0;
        int hig=n-1; 
        
        while(lo<=hig){
            mid=(lo+hig)/2;
        
        
        if(nums[mid]==tar)return mid;
        
        else if(nums[mid]<tar)lo=mid+1;
        
        else hig =mid-1;
        }
             return -1;
    }
   
}