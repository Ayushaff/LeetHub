class Solution {
public:
    int waysToSplitArray(vector<int>& nums) {
        long long sum=0;         int cnt=0;
        long long csum=0;  int len=nums.size();
        for(long it:nums) sum+=it;
        
        for(int i=0;i<len-1;i++){
            csum+=nums[i];
            if(csum>=sum-csum)cnt++;
        }
        return cnt;
    }
};