class Solution {
private static void f(int ind,int arr[],List<List<Integer>>ans,List<Integer>ds){
                if(ind==arr.length){
                        // List<Integer>d=new ArrayList<>(ds);
                        // Collections.sort(d);
                        ans.add(new ArrayList<>(ds));
                        return;
                }
                ds.add(arr[ind]);
                f(ind+1,arr,ans,ds);
                ds.remove(ds.size()-1);
                //conditions for unique
                while(ind<arr.length-1 && arr[ind]==arr[ind+1])
                        ind++;
        
                f(ind+1,arr,ans,ds);
        }
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        List<List<Integer>>ans=new ArrayList<>();
            Arrays.sort(arr);
            f(0,arr,ans,new ArrayList<>());
            return ans;
    }
}