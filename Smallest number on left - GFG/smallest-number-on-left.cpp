//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution{
public:
    vector<int> leftSmaller(int n, int arr[]){
        stack<int>st;vector<int>v;
        
        for(int i=0;i<n;i++){
            while(!st.empty() && st.top()>=arr[i])
                st.pop();
                
                int res=(st.empty()) ?-1:st.top();
                st.push(arr[i]);
                 v.push_back(res); 
        }
        return v;
    }
};
       /* // code here
        vector<int>v;
        int nxt=0;
        for(int i=0;i<n;i++){
            nxt=-1;
            for(int j=i-1;j>=0;j--){
                if(arr[j]<arr[i]){
                nxt=arr[j];
                break;
                }  
            }
            v.push_back(nxt);
        }
     return v;   
    }
};*/

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int a[n];
        for(int i = 0;i < n;i++)
            cin>>a[i];
        
        Solution ob;
        vector<int> ans = ob.leftSmaller(n, a);
        for(int i = 0;i < n;i++)
            cout<<ans[i]<<" ";
        cout<<endl;
    }
    return 0;
}
// } Driver Code Ends