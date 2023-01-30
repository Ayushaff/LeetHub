class Solution {
        private static void f(int []nums,boolean[]freq,List<List<Integer>>ans,List<Integer>ds){
                if(ds.size()==nums.length){
                        ans.add(new ArrayList<>(ds));
                        return;
                }
                for(int i=0;i<nums.length;i++)
                {
                        if(!freq[i])
                        {
                                freq[i]=true;
                                ds.add(nums[i]);
                                f(nums,freq,ans,ds);
                                ds.remove(ds.size()-1);
                                freq[i]=false;
                        }
                }
                
        }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
            boolean[]freq=new boolean[nums.length];
            f(nums,freq,ans,new ArrayList<>());
            return ans;            
    }
}