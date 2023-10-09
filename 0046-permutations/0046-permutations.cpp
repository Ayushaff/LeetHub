class Solution {
public:
    void p(int ind,vector<int>&nums,vector<vector<int>>&ans){
        if(ind==nums.size()){
            ans.push_back(nums);
            return;
        }
        for(int i=ind;i<nums.size();i++){
            swap(nums[i],nums[ind]);
            p(ind+1,nums,ans);
            swap(nums[i],nums[ind]);
        }
    }
    
    // void p(vector<int>nums,vector<vector<int>>&ans,vector<int>&ds,vector<int>&freq){
    //     if(ds.size()==nums.size()){
    //         ans.push_back(ds);
    //         return;
    //     }
    //     for(int i=0;i<nums.size();i++){
    //         if(freq[i]==false){
    //             freq[i]=true;
    //             ds.push_back(nums[i]);
    //             p(nums,ans,ds,freq);
    //             ds.pop_back();
    //             freq[i]=false;
    //         }
    //     }
    // }
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>>ans;
        
        p(0,nums,ans);
        return ans;
    }
};