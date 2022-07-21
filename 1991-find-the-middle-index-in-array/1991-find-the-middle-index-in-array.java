class Solution {
    public int findMiddleIndex(int[] nums) {
        int currsum = 0, totlsum = 0;
        int n=nums.length;
        for (int i=0;i<n;i++) {
            totlsum += nums[i];
        }
        for (int i = 0; i < n; i++) {
            if (currsum == (totlsum - currsum - nums[i])) {
                return i;
            }
            currsum += nums[i];
        }
        return -1;
    }
}