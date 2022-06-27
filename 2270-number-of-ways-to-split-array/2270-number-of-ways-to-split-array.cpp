class Solution {
public:
    int waysToSplitArray(vector<int>& nums) {
        long long sum=0;         int cnt=0;
        long long currsum=0;  int len=nums.size();
        for(long it:nums) sum+=it;
        
        for(int i=0;i<len-1;i++){
            currsum+=nums[i];
            long long res=sum-currsum;
            if(currsum>=res)cnt++;
        }
        return cnt;
    }
};