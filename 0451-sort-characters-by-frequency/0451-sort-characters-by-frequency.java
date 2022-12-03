class Solution {
    public String frequencySort(String s) {
        // max priority queue O(nlogn) ,frequency map O(n)
        //TC O(nlogn)
        
        //TC O(N) with array withut sorting
        
        Map<Character,Integer>mp=new HashMap<>();
        for(char c:s.toCharArray())
            mp.put(c,mp.getOrDefault(c,0)+1);       //freq map done for each characters of string
        
        List<Character>bucket[]=new List[s.length()+1];   //bucket array of type list of characters (Array of lists)
        
        for(Character key:mp.keySet()){
            int freq=mp.get(key);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(key);
        }
            StringBuilder sb=new StringBuilder();
            
            for(int i=bucket.length-1;i>=0;i--){
                if(bucket[i]!=null){
                for(char c:bucket[i]){
                    for(int j=0;j<i;j++){
                        sb.append(c);
                        }
                    }
                }
            }
        return sb.toString();
    }
}