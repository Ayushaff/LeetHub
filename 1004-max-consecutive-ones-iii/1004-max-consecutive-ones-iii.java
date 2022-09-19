class Solution {
    public int longestOnes(int[] nums, int k) {
        int s=0, e=0 ,flippedOnes=0, maxLen=0;
            
            while(e<nums.length)
            {
                    if(nums[e]==1)
                    {
                        e++;                            
                    }else{ 
                        //(nums[e]==0)
                        if(flippedOnes<k)
                        {
                                flippedOnes++;
                                e++;
                        }else{
                                //reduce some of flips
                                while(flippedOnes>=k)
                                {
                                        if(nums[s]==0){
                                           flippedOnes--;
                                        }
                                  s++;
                                }                                
                        }
                    }
                    maxLen=Math.max(maxLen,(e-s));
            }            
            return maxLen;
    }        
}