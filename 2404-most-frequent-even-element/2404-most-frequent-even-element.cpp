class Solution {
    public int mostFrequentEven(int[] nums) {
            //tc O(n)
        HashMap<Integer,Integer>counts =new HashMap<>();
            for(int i:nums)
            {
            if(i%2==0)                    
                    counts.put(i,counts.getOrDefault(i,0)+1);
               // if(counts.containsKey(nums[i]))
               //      counts.put(nums[i],counts.get(nums[i])+1);
               //  else 
               //      counts.put(nums[i],1);                             
            }
            int ans=-1 ,maxFreq=Integer.MIN_VALUE;
            
            for(Integer num:counts.keySet()){
                    
                if(counts.get(num)>maxFreq){
                   maxFreq=counts.get(num);
                        ans=num;
                }
                else if(counts.get(num)==maxFreq && ans>num){
                        ans=num;                        
                }    
                    
            }
            return ans;
    }
}