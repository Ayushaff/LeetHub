class Solution {
    public int singleNumber(int[] nums) {
            int res=0;
        for(Integer a:nums)
                res^=a;
            return res;
    }
}