class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer>hs=new HashSet<>();
        int n=nums.length;
        
        int i=0,j=0;
        int currentSum=0, ans=0;
        
       while(j<n){
           while(hs.contains(nums[j])){
               hs.remove(nums[i]);
               currentSum-=nums[i];
               i++;
           }
           currentSum+=nums[j];
           ans=Math.max(ans,currentSum);
           hs.add(nums[j]);           
           j++;
           }
        return ans;
       }
}