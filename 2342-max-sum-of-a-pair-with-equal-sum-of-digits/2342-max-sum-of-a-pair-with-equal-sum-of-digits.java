class Solution {
    
    private int getSum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    
    public int maximumSum(int[] nums) {
        int n=nums.length;
            Map<Integer,Integer>map=new HashMap<>();
        //key is sum eg. 18's sum is 9 so map has key is 9 (sum of digits) and vallue is {18, 36} (integers thats is all numbers which has this  particular sum of digits) 
        int ans=-1;
        
            for(int i=0;i<n;i++)
            {
                int currSum=getSum(nums[i]);
                if(!map.containsKey(currSum)){  //that sum of digits is not there in map
                    map.put(currSum,nums[i]);
                }
                else{
                    ans=Math.max(ans,map.get(currSum)+nums[i]);
                    map.put(currSum,Math.max(map.get(currSum),nums[i]));
                }
                // List<Integer>list=map.get(currSum);
                // list.add(nums[i]);
                // map.put(currSum,list);
            }
            // for(Integer currSum:map.keySet()){
            //     List<Integer>list=map.get(currSum);
            //     if(list.size()<2)
            //         continue;
            //     Collections.sort(list);
            //     ans=Math.max(ans,list.get(list.size()-1)+list.get(list.size()-2));  //just want 2 pairs of integers thats is all numbers which has this  particular sum of digits) 
            // }   
        return ans;
    }
}