class Solution {
    public int numIdenticalPairs(int[] nums) {
        int temp[]=new int[101]; //nums.length<=100
            int res=0;
            for(int a:nums){
                    res+=temp[a];
                    temp[a]++;
            }
            return res;
            
    }
}