class Solution {
        private static void f(int ind,int []arr,List<List<Integer>>ans,ArrayList<Integer>ds){
                if(ind>=arr.length){
                        ans.add(new ArrayList<>(ds));
                        return;
                }
                ds.add(arr[ind]);
                f(ind+1,arr,ans,ds);
                ds.remove(ds.size()-1);
                f(ind+1,arr,ans,ds);        
        }
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>>ans=new ArrayList<>();
            f(0,arr,ans,new ArrayList<>());
            return ans;
    }
}