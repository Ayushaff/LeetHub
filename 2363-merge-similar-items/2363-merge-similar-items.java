class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] item1, int[][] item2) {

        Map<Integer,Integer>mp=new TreeMap<>();
        
        for(int[] i:item1){
            int vkey=i[0];
            int wval=i[1];
            mp.put(vkey,mp.getOrDefault(vkey,0)+wval);
        }
        
        for(int[] i:item2){
            int vkey=i[0];
            int wval=i[1];
            mp.put(vkey,mp.getOrDefault(vkey,0)+wval);
        }
        List<List<Integer>>ans=new ArrayList<>();        
        
        for(Integer val: mp.keySet()){
            List<Integer>temp=new LinkedList<>();
            temp.add(val);
            temp.add(mp.get(val));
            ans.add(temp);
        }
        return ans;
    }
}