class Solution {
public:
    void p(int i,int k,int tar,vector<vector<int>>&ans,vector<int>&ds){
        //bc
        if(k==0){
            if(tar==0){
                ans.push_back(ds);
            }
            return;
        }
        
        if(i<=9){
            ds.push_back(i);
            p(i+1,k-1,tar-i,ans,ds);
            
            ds.pop_back();
            p(i+1,k,tar,ans,ds);
        }
    }
    vector<vector<int>> combinationSum3(int k, int n) {
        //approach 1 pick and no pick
        vector<vector<int>>ans;
        vector<int>ds;
        
        p(1,k,n,ans,ds);
        return ans;
    }
};