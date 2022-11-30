class Solution {
    public boolean uniqueOccurrences(int[] arr) {
    // Store the frequency of elements in the unordered map.
        Map<Integer,Integer>mp=new HashMap<>();
        
        for(int i:arr){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        
        // Store the frequency count of elements in the unordered set.
        Set<Integer>set=new HashSet<>(mp.values());
        // If the set size is equal to the map size, 
        // It implies frequency counts are unique.
        return mp.size()==set.size();
    }
} 