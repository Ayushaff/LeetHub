class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
            if(nums[i]==nums[i+1]) 
        return true;
        return false;
        */
        HashSet<Integer>set=new HashSet<>();
        
        for(int i=0;i<nums.length;i++)
        set.add(nums[i]);
        int size=set.size();
        if(size==nums.length)return false;
        else return true;
    }
    
}