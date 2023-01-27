class Solution {
public:
        void find(int ind,vector<int>&arr,int tar,vector<vector<int>>&ans,vector<int>&ds){
                if(ind==arr.size())
                {
                        if(tar==0){
                                ans.push_back(ds);
                        }
                        return;
                }
                if(arr[ind]<=tar){
                        ds.push_back(arr[ind]);
                        find(ind,arr,tar-arr[ind],ans,ds);
                        ds.pop_back();
                }
                find(ind+1,arr,tar,ans,ds);
        }
    vector<vector<int>> combinationSum(vector<int>& candidates, int tar) {
        vector<vector<int>>ans;
            vector<int>ds;
            
            find(0,candidates,tar,ans,ds);
            return ans;
    }
};