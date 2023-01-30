class Solution {
        //optimez the space about freq array 2 approach
        private static void f(int ind,int []arr,List<List<Integer>>ans){
                if(ind==arr.length){List<Integer>ds=new ArrayList<>();
                        for(int i:arr){
                                
                                ds.add(i);
                        }
                        ans.add(new ArrayList<>(ds));
                        return;
                }
                for(int i=ind;i<arr.length;i++){
                        swap(i,ind,arr);
                        f(ind+1,arr,ans);
                        swap(i,ind,arr);
                }
        }
                private static void swap(int i ,int ind,int []arr){
                        int t=arr[i];
                        arr[i]=arr[ind];
                        arr[ind]=t;
                }
        
        public List<List<Integer>> permute(int[] arr) {
                List<List<Integer>>ans=new ArrayList<>();
                f(0,arr,ans);
                return ans;
        }
}
        
        
        //1
 /*       private static void f(int []nums,boolean[]freq,List<List<Integer>>ans,List<Integer>ds){
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
}*/