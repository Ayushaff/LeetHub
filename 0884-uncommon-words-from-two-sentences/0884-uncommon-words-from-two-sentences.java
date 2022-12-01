    class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        /*
        Time Complexity: O(M + N), where M,N are the lengths of A and B respectively.

Space Complexity: O(M + N), the space used by count.
        */
         Map<String,Integer>mp=new HashMap<>();
        
        
        
        for(String w:s1.split(" ")){
            mp.put(w,mp.getOrDefault(w,0)+1);
        }
        
        for(String w:s2.split(" "))
        {
            mp.put(w,mp.getOrDefault(w,0)+1);
        }
        
        List<String>ans=new LinkedList<>();
        // for(Map<String,Integer>entry:mp.entrySet())
        //     if(entry.getKey())
        //         ans.add(w);
        
        // map.forEach((k,v) -> 
        //             if(v==1)
        //             ans.add(k)
        //            ); 
        
        for (Map.Entry<String,Integer> entry : mp.entrySet()) //using map.entrySet() for iteration  
{  
    if(entry.getValue()==1)
        ans.add(entry.getKey());
}   
        
        return ans.toArray(new String[ans.size()]);
    }
}