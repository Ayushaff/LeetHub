public class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        
        // Calculate the maximum values to the left of every index.
        int[] maxToLeft = new int[n];
        maxToLeft[0] = nums[0];
        for (int i = 1; i < n; i++) {
            maxToLeft[i] = Math.max(maxToLeft[i - 1], nums[i]);
        }

        // Calculate the maximum values to the right of every index.
        int[] maxToRight = new int[n];
        maxToRight[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxToRight[i] = Math.max(maxToRight[i + 1], nums[i]);
        }

        // Iterate over each index j, and calculate the value of the triplet.
        long result = 0;
        for (int j = 1; j < n - 1; j++) {
            long value = (long)(maxToLeft[j - 1] - nums[j]) * maxToRight[j + 1];
            result = Math.max(result, value);
        }

        return result;
    }
}
