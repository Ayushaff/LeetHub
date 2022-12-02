class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        
        for(int i:nums)
            mp.put(i,mp.getOrDefault(i,0)+1);
        
        // for (Map.Entry<Integer,Integer> entry : mp.entrySet()) 
        //     System.out.println("Key = " + entry.getKey() +
        //                      ", Value = " + entry.getValue());
        
        int s=0;
        for (Map.Entry<Integer,Integer> entry : mp.entrySet()) //using map.entrySet() for iteration  
        {  
            if(entry.getValue()==1)
                s+=entry.getKey();
        }   
       
        return s;
    }
}