//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution{
  public:
//   recursion
//   int knap(int w,int length[],int price[],int n){
//          if(n==0||w==0)return 0;
//          int mmax=0;

//          if(length[n-1]<=w) {
//              return mmax=max(price[n-1]+knap(w-length[n-1],length,price,n),knap(w,length,price,n-1));
//          }
//          else if(length[n-1]>w)
//              return knap(w,length,price,n-1);
//      }

// memoization
// int knap(int w,int length[],int price[],int n){
//     //
//     if(n==0||w==0)return 0;
    
//     int mmax=0;
//     int dp[n+1][n+1];
//     memset(dp,-1,sizeof(dp));
//     if(dp[n][n]!=-1)return dp[n][n];
    
//     if(length[n-1]<=w){
//         return dp[n][n]=max(price[n-1]+knap(w-length[n-1],length,price,n),knap(w,length,price,n-1));
//     }else{
//         return dp[n][n]=knap(w,length,price,n-1);
//     }
// }

//tabulation
int knap(int w,int length[],int price[],int n){
    int t[n+1][n+1];
    for(int i=0;i<n+1;i++){
          for(int j=0;j<w+1;j++){
              if(i==0||j==0)
                  t[i][j]=0;
           
          }
      }
      for(int i=1;i<n+1;i++){
          for(int j=1;j<w+1;j++){
            if(length[i-1]<=j)
                t[i][j]=max(price[i-1]+t[i][j-length[i-1]],t[i-1][j]);
                
            else if(length[i-1]>j)
                t[i][j]=t[i-1][j];
          }
      }
      return t[n][n];
}

    int cutRod(int price[], int n) {
        //code here
        //same as unbounded knapsack thing is 
        
        /*
        price[] is val[]
        length[] is wt[]
        length can be made by given N
        N = W
        */
        int length[n];
        for(int i=0;i<n;i++)
            length[i]=i+1;
        return knap(n,length,price,n);
        

     
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int a[n];
        for (int i = 0; i < n; i++) 
            cin >> a[i];
            
        Solution ob;

        cout << ob.cutRod(a, n) << endl;
    }
    return 0;
}
// } Driver Code Ends