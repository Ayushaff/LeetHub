class Solution {
    public boolean containsDuplicate(int[] nums) {
        
            //3 maps
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int i:nums){
                    if(map.containsKey(i))
                            map.put(i,map.get(i)+1);
                    else 
                            map.put(i,1);
                    if(map.get(i)>1)
                            return true;
            }

            return false;
    }
}
            
            //4
            /*
        HashSet<Integer>set=new HashSet<>();
        
        for(int i=0;i<nums.length;i++)
        set.add(nums[i]);
        int size=set.size();
        return size!=nums.length;
            */
        /*if(size==nums.length)return false;
        else return true;*/
            
            /*
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
            if(nums[i]==nums[i+1]) 
        return true;
        return false;
     
    }*/
            /*
        //1 O(N^2)
        //2 (NlogN) sorting then linear search
        //3 O(N) O(N) frequency array or unordered_map 
        //4 O(N) O(N) unordered_set
    
}*/