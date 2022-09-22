class Solution {
    public int missingNumber(int[] nums) {
       int s=0;
            int n=nums.length;
                                 
            for(int i=0;i<n;i++){
                    s+=nums[i];
                    //System.out.println(s)
            }
            
            return (n*(n+1))/2 - s;
    }
}