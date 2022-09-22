class Solution {
public:
    int missingNumber(vector<int>& nums) {
       //best approach xor
            int n=nums.size();
          int v,index;
            for(v=0 ,index=0; index<n;index++){
                    v=(v^index) ^nums[index];
            }
            return v^index;
    }
};