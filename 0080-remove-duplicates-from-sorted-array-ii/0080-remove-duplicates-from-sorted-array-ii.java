class Solution {
    public int removeDuplicates(int[] nums) {
//O(n) O(1)
    int i = 0;

    for (int n : nums)

        if (i < 2 || n != nums[i-2]) {
            nums[i] = n;
            i++;
        }

    return i;

}
}
//O(n) O(n) hashmap