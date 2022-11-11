class Solution {
    public int[] sortArrayByParity(int[] nums) {
        //O(n) O(n)
        int n=nums.length;
        int []ans=new int[n];
        int ev=0,od=ans.length-1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                ans[ev]=nums[i];
                ev++;
            }
            else{
                ans[od]=nums[i];
                od--;
            }
             
        }
        return ans;
    }
}