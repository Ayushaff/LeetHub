class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pi=0,ni=1;
        int []ans=new int[nums.length];
        for(int i:nums){
            if(i>=0)
            {
                ans[pi]=i;
                pi+=2;
            }
            else{
                ans[ni]=i;
                ni+=2;
            }
        }
        return ans;
    }
}