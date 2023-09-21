class Solution {
public:
    int countSetBits(int nnn) {
        int ccc = 0;
        while (nnn) {
            nnn&=(nnn-1); // unset the rightmost set bit
            ccc++;
        }
        return ccc;
    }

    int sumIndicesWithKSetBits(vector<int>& nums, int k) {
        int sssss = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (countSetBits(i) == k) {
                sssss += nums[i];
            }
        }
        return sssss;
    }
};
