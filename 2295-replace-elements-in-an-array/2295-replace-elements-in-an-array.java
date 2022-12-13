class Solution {
    public int[] arrayChange(int[] nums, int[][] op) {
        //brute O(m*n) search and replace 
        //tc O(m*n) O(1)
        int n=nums.length;
        Map<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            hm.put(nums[i],i);
        }
        for(var it:op){
            //int ind=hm.get(it[0]);//will get index
            nums[hm.get(it[0])]=it[1]; //replace value to its index
            hm.put(it[1],hm.get(it[0]));//update new value to with its index
        }
        return nums;
    }
}