class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int []freq1=new int[2001];
            for(int el:nums1)
                    freq1[el+1000]++;
            
        int []freq2=new int[2001];
            for(int el:nums2)
                    freq2[el+1000]++;
        
            List<Integer>firstEl=new ArrayList<>();
            
            for(int el:nums1){
                    if(freq2[el+1000]==0){//if nums1 element's freq in freq2 is 0 then add in firstEl list 
                        if(!firstEl.contains(el))
                                //better check if it does already exist or not otherwise add
                                firstEl.add(el);
                    }                            
            }
            
            List<Integer>secEl=new ArrayList<>();
            
           for(int el:nums2){
                   if(freq1[el+1000]==0){
                           if(! secEl.contains(el)){
                                   secEl.add(el);
                           }
                   }
           }
            
            List<List<Integer>>ans=new ArrayList<>();
            ans.add(firstEl);
            ans.add(secEl);
            
            return ans;
    }
}