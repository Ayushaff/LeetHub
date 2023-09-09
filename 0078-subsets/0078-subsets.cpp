class Solution {
public:
    void f(int i,vector<int>& arr,vector<int>& ds,vector<vector<int>>& ans){
        if(i>=arr.size()){
            ans.push_back(ds);
            return;
        }
        //include
        ds.push_back(arr[i]);
        f(i+1,arr,ds,ans);
        //exclude
        ds.pop_back();
        f(i+1,arr,ds,ans);
    }
    vector<vector<int>> subsets(vector<int>& arr) {
        vector<vector<int>>ans;
        vector<int>ds;
        f(0,arr,ds,ans);
        return ans;
    }
};