class Solution {
public:
    vector<int> frequencySort(vector<int>& nums) {
             unordered_map<int,int>mp;
        for(auto x:nums){
            mp[x]++;
        }
        sort(nums.begin(),nums.end(),[&](int a,int b){
            return mp[a]!=mp[b] ? mp[a]<mp[b] : a>b;
            
        });
        return nums;
        /*
        its using lambda funtion during sort the lambda funtion specifies how to start
        1. if 2 nums have diffrent frequencies then the one with smaller frequencies goes first
        2. otherwise ,the one that is lexiographically greater goes first
        lexiographically means which is really greater than the that number 3>2
        */
        
    }
};