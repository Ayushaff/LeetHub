class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        //search for remainders stored in map 
        Map<Integer,Integer>mp=new HashMap<>(); 
        
        mp.put(0,1);
        int ans=0,sum=0,rem=0,n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            rem=sum%k;

            if(rem<0)
                rem+=k;
            if(mp.containsKey(rem)){
                ans+=mp.get(rem);
                mp.put(rem,mp.get(rem)+1);
            }else
            mp.put(rem,1);
            
        }
        return ans;
    }
}
