class Solution 
{
    public int subarraySum(int[] nums, int k) 
    {
        
        Map<Integer,Integer>map =new HashMap<>();
        int maxi =0, sum=0;
        
        int n =nums.length;
        
        map.put(0,1);
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
          
                if(map.containsKey(sum-k))
                {
                    maxi+=map.get(sum-k);
                }
                
                map.put(sum,map.getOrDefault(sum,0)+1);
                            
        }
        return maxi;
    }
}