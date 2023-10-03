class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        vector<int>v(101,0);
        int c=0;
        for(int i:nums){
            c+=v[i];
            v[i]++;
        }
        return c;
    }
};