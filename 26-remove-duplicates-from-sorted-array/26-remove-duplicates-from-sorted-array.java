class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n<=1) return n;
        //two pointer
        int i=0;
        
        int j=i+1;
        
        while(j<nums.length)
        {            
            if(nums[i]!=nums[j])
            {
                   i++;
                   nums[i]=nums[j];
             }            
            j++;
        }   
        return (i+1);
    }
}