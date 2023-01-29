class Solution {
        private static void f(int ind,int []arr,int n,List<List<Integer>>ans,ArrayList<Integer>ds){
                if(ind>=n){
                        ans.add(new ArrayList<>(ds));
                        return;
                }
                ds.add(arr[ind]);
                f(ind+1,arr,n,ans,ds);
                ds.remove(ds.size()-1);
                f(ind+1,arr,n,ans,ds);        
        }
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>>ans=new ArrayList<>();
            f(0,arr,arr.length,ans,new ArrayList<>());
            return ans;
    }
}