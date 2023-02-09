class Solution {
    public int distinctAverages(int[] nums) { 
        Set<Double>s=new HashSet<>();
            int n=nums.length;
            Arrays.sort(nums);//nlogn
            for(int i=0;i<n/2;i++){
                    double avg=(nums[i]+nums[n-1-i])/2.0;
                            s.add(avg);//logn
            }
            return s.size();
    }
}
//O(nlogn)