class Solution {
    public int findMaxLength(int[] nums) {
        
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        if(nums==null || n==0)
            return 0;
        
        for(int i=0;i<n;i++)
            if(nums[i]==0)
                nums[i]=-1;
        
        int maxi=0 ,sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum==0){
                maxi=i+1;
            }
            else{
                if(map.get(sum)!=null){
                    maxi=Math.max(maxi, i-map.get(sum));
                }
                else{
                    map.put(sum,i);
                }
            }
        }
        return maxi;
    }
}