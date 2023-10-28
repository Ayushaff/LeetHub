//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function template for C++

class Solution{
  public:
  //tabulation
  //find lcs  with help of string given and given string reversed 
  int lcs(int n,int m,string a,string b){
      int t[n+1][m+1];
      
      for(int i=0;i<=n;i++){
          for(int j=0;j<=m;j++){
              
              if(i==0 or j==0)
                t[i][j]=0;
                
            else if(a[i-1] == b[j-1])
                t[i][j]=1+t[i-1][j-1];
                
            else 
                t[i][j]=max(t[i-1][j],t[i][j-1]);
            
          }
      }
         return t[n][m];
  }
  int minimumNumberOfDeletions(string a) { 
        //code here
        
        string b=a;
        reverse(a.begin(),a.end());
        
        int n=a.size();
        int ans=lcs(n,n,a,b);
        return n-ans;
  }
  //memoization
// //   int t[1001][1001];
// //   memset(t,-1,sizeof(t));
//   vector<vector<int>> dp;

//     Solution() {
//         dp.resize(1001, vector<int>(1001, -1));
//     }
//   int lcs(string a,string b,int n,int m){
//       if(!n || !m)
//         return 0;
    
//         if(dp[n][m]!=-1)
//             return dp[n][m];
            
//             if(a[n-1]==b[m-1])
//                 return dp[n][m]=1+lcs(a,b,n-1,m-1);
                    
//                 else 
//                     return dp[n][m]=max(lcs(a,b,n,m-1),lcs(a,b,n-1,m));
                    
//   }
//     int minimumNumberOfDeletions(string s) { 
//         string a=s;
//         int n=a.size();
        
//         reverse(s.begin(),s.end());
//         return n-lcs(a,s,n,n);
//     } 
};

//{ Driver Code Starts.
int main(){
    int t;
    cin >> t;
    while(t--){
        string S;
        cin >> S;
        Solution obj;
        cout << obj.minimumNumberOfDeletions(S) << endl;
    }
    return 0;
}
// } Driver Code Ends