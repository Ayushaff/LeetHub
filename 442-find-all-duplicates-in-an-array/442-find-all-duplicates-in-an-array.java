class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>Output_arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0)Output_arr.add(index+1);
                else nums[index]=-nums[index];
        }
            return Output_arr;
    }
}