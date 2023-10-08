class Solution {
public:
    void p(vector<int>nums,vector<vector<int>>&ans,vector<int>&ds,vector<int>&freq){
        if(ds.size()==nums.size()){
            ans.push_back(ds);
            return;
        }
        for(int i=0;i<nums.size();i++){
            if(freq[i]==false){
                freq[i]=true;
                ds.push_back(nums[i]);
                p(nums,ans,ds,freq);
                ds.pop_back();
                freq[i]=false;
            }
        }
    }
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>>ans;
        vector<int>ds;
        vector<int>freq(nums.size(),false);
        p(nums,ans,ds,freq);
        return ans;
    }
};