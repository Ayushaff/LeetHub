//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution{
    //recursion
//     private:
//     int knap(int w,int wt[],int val[],int n){
//         int mmax=0;
//         if(n==0||w==0)return 0;
        
//         if(wt[n-1]<=w) {
//             return mmax=max(val[n-1]+knap(w-wt[n-1],wt,val,n),knap(w,wt,val,n-1));
//         }
//         else if(wt[n-1]>w)
//             return knap(w,wt,val,n-1);
//     }
// public:
//     int knapSack(int n, int w, int val[], int wt[])
//     {
//             return knap(w,wt,val,n);
//     }
// {
//     //memorize
//         int mmax=0;
//         int dp[102][1002];
//         memset(dp,-1,sizeof(dp));
//         if(n==0||w==0)return 0;
//         if(dp[n][w]!=-1)
//         return dp[n][w];
        
//         if(wt[n-1]<=w) {
//             return dp[n][w]=max(val[n-1]+knapSack(n,w-val[n-1],val,wt),knapSack(n-1,w,val,wt));
//         }
//         else if(wt[n-1]>w)
//             return dp[n][w]=knapSack(n-1,w,val,wt);
   
// }
//tabulation
public:
int knapSack(int n, int w, int val[], int wt[]){
      // code here
      int t[n+1][w+1];
      for(int i=0;i<n+1;i++){
          for(int j=0;j<w+1;j++){
              if(i==0||j==0)
                  t[i][j]=0;
           
          }
      }
      for(int i=1;i<n+1;i++){
          for(int j=1;j<w+1;j++){
              if(wt[i-1]<=j){
                  t[i][j]=max(val[i-1]+t[i][j-wt[i-1]],t[i-1][j]);
              }
              else if(wt[i-1]>j){
                  t[i][j]=t[i-1][j];
              }
          }
      }
      return t[n][w];
  }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int N, W;
        cin>>N>>W;
        int val[N], wt[N];
        for(int i = 0;i < N;i++)
            cin>>val[i];
        for(int i = 0;i < N;i++)
            cin>>wt[i];
        
        Solution ob;
        cout<<ob.knapSack(N, W, val, wt)<<endl;
    }
    return 0;
}
// } Driver Code Ends