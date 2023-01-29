class Solution {
     public void func(int index,int[]nums,List<Integer>ds,List<List<Integer>>list){
        if(index>=nums.length){
            //List<Integer>k = new ArrayList<>(ds);
            //Collections.sort(k);
            //list.add(k);
            list.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[index]);
        func(index+1,nums,ds,list);
        ds.remove(ds.size()-1);
        while(index<nums.length-1 && nums[index]==nums[index+1])index++;
        func(index+1,nums,ds,list);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        func(0,nums,new ArrayList<>(),list);
        return list;
    }
} 