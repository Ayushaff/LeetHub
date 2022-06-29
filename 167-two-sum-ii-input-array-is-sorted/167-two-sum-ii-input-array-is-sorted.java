class Solution {
    public int[] twoSum(int[] nums, int tar) {
        int n=nums.length;
        int s=0, e = n-1;
        
        while(s<e){
            if(nums[s]+nums[e]>tar){
                e--;
            }else if(nums[s]+nums[e]<tar){
                s++;
            }
            else{
                return new int []{s+1,e+1};
            }
        }
        return new int[]{};
    }
}