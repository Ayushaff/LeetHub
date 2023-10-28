//{ Driver Code Starts
//Initial template for C++

#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{
  public:
  //find lcs  with help 
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
    int longestPalinSubseq(string a) {
        //code here
        
        string b=a;
        reverse(a.begin(),a.end());
        int n=a.size();
        int ans=lcs(n,n,a,b);
        return ans;
    }
};

//{ Driver Code Starts.

int32_t main()
{
    int t; cin >> t;
    while (t--)
    {
        string s; cin >> s;
        Solution ob;
        cout << ob.longestPalinSubseq(s) << endl;
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends