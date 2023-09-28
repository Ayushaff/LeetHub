//{ Driver Code Starts
//Initial template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function template for C++

class Solution {
  public:
    //Function to return a list of indexes denoting the required 
    void f(int ind,vector<int>&arr,int tar,vector<vector<int> >&ans,vector<int>&ds){
        
        if(ind==arr.size()){
            if(tar==0){
                ans.push_back(ds);
            }
            return;
        }
        
        if(arr[ind]<=tar){
            ds.push_back(arr[ind]);
            f(ind,arr,tar-arr[ind],ans,ds);
            ds.pop_back();
        }
        
        //this while loop is for checking the array unique or not
        //no need if alredy did set part in main function and sort also for sorted subsets
        while(ind<arr.size()-1 && arr[ind+1]==arr[ind] )
        {
            ind++;
        }
        f(ind+1,arr,tar,ans,ds);
    }
    
    //combinations whose sum is equal to given number.
    vector<vector<int> > combinationSum(vector<int> &a, int tar) {
        // Your code here
        //need all unique combos and sorted too
        
        set<int> st(a.begin(),a.end());
        vector<int> arr(st.begin(),st.end());
        sort(arr.begin(),arr.end());
        
        vector<vector<int> >ans;
        vector<int>ds;
        
        f(0,arr,tar,ans,ds);
        return ans;
    }
};

//{ Driver Code Starts.
int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> A;
        for(int i=0;i<n;i++){
            int x;
            cin>>x;
            A.push_back(x);
        }   
        int sum;
        cin>>sum;
        Solution ob;
        vector<vector<int>> result = ob.combinationSum(A, sum);
   		if(result.size()==0){
   			cout<<"Empty";
   		}
        for(int i=0;i<result.size();i++){
            cout<<'(';
            for(int j=0;j<result[i].size();j++){
                cout<<result[i][j];
                if(j<result[i].size()-1)
                    cout<<" ";
            }
            cout<<")";
        }
        cout<<"\n";
    }
}	
// } Driver Code Ends