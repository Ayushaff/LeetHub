class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = findStartingIndex(nums, target);
        res[1] = findEndingIndex(nums, target);
        return res;
    }

    public int findStartingIndex(int[] nums, int target) {
        int firstIndex = -1;
        int lo = 0;
        int hi = nums.length - 1;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            
            if (nums[mid] >= target) {
                hi = mid - 1;//will take high to left evry time if even we found target leads us to giving start index
            } 
            else{
                lo = mid + 1;
            }
            if (nums[mid] == target)
                firstIndex = mid;
        }
        return firstIndex;
    }

    public int findEndingIndex(int[] nums, int target) {
        int lastIndex = -1;
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] <= target) {
                lo = mid + 1;//will take low to right evry time if even we found target which leads us to giving end index
            } else {
                hi = mid - 1;
            }
            if (nums[mid] == target)
                lastIndex = mid;
        }
        return lastIndex;
    }
}