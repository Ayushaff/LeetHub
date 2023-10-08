//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
class Solution
{
public:
void p(int i,int s,vector<int>&arr,int n,vector<int>&ans){
    
    if(i==n){
        ans.push_back(s);
        return;
    }
    
    // ds.push_back(arr[i]);
    s+=arr[i];
    p(i+1,s,arr,n,ans);
    
    // ds.pop_back();
    s-=arr[i];
    p(i+1,s,arr,n,ans);
}
    vector<int> subsetSums(vector<int> arr, int n)
    {
        // Write Your Code here
        vector<int>ans;
        
        int s=0;
        p(0,s,arr,n,ans);
        return ans;
    }
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int N;
        cin>>N;
        vector<int> arr(N);
        for(int i = 0 ; i < N ; i++){
            cin >> arr[i];
        }
        Solution ob;
        vector<int> ans = ob.subsetSums(arr,N);
        sort(ans.begin(),ans.end());
        for(auto sum : ans){
            cout<< sum<<" ";
        }
        cout<<endl;
    }
    return 0;
}
// } Driver Code Ends