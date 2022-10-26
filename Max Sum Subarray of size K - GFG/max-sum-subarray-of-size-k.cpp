//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
class Solution{   
public:
    long maximumSumSubarray(int k , vector<int> &arr , int n){
        // code here 
        if(n<k)
        return -1;
        
        int i=0,j=0;
        long sum=0,maxe=INT_MIN;
        
        while(j<n){
            int winsz=(j-i+1);
            sum+=arr[j];
            if(winsz<k)
            j++;
            else if(winsz==k)
            {
                maxe=max(sum,maxe);
                sum-=arr[i];
                i++,j++;
            }
        }
        return maxe;
    }
};

//{ Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        int N,K;
        cin >> N >> K;;
        vector<int>Arr;
        for(int i=0;i<N;++i){
            int x;
            cin>>x;
            Arr.push_back(x);
        }
        Solution ob;
        cout << ob.maximumSumSubarray(K,Arr,N) << endl;
    }
    return 0; 
} 
// } Driver Code Ends