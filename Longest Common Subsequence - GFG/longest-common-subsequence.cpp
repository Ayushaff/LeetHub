//{ Driver Code Starts
#include<bits/stdc++.h>
const int mod=1e9+7;
using namespace std;

// } Driver Code Ends
// function to find longest common subsequence

class Solution
{
//tabulation
//Time Complexity: O(m * n) which is much better than the worst-case time complexity of Naive Recursive implementation. 
//Auxiliary Space: O(m * n) because the algorithm uses an array of size (m+1)*(n+1) to store the length of the common substrings.

    public:
    int lcs(int n, int m, string x, string y)
    {
    int t[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0||j==0)
                    t[i][j]=0;
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(x[i-1]==y[j-1])
                    t[i][j]=1+t[i-1][j-1];
                
                else 
                    t[i][j]=max(t[i-1][j],t[i][j-1]);
            }
        }
        return t[n][m];
    }


//MEMOIZATION TLC
// Time Complexity: O(m * n) where m and n are the string lengths.
// Auxiliary Space: O(m * n) Here the recursive stack space is ignored.
//     public:
//     int t[1001][1001];
//     int lcss(int n, int m, string x, string y){
//         if(n==0||m==0)
//             return 0;
            
//         if(t[n][m]!=-1)
//             return t[n][m];
            
//         if(x[n-1]==y[m-1])
//             return t[n][m]=1+lcss(n-1,m-1,x,y);
            
//         else 
//             return t[n][m]=max(lcss(n,m-1,x,y),lcss(n-1,m,x,y));
//     }
    
//     int lcs(int n, int m, string x, string y)
// {
//     memset(t,-1,sizeof(t));
//     int ans=lcss(n,m,x,y);
//     return ans;
    
// }


    // RECURSION TLC 
    // Time Complexity: O(2m*n)
    // Auxiliary Space: O(1)
    
    // {
    //     // your code here
    //     if(n==0||m==0)
    //         return 0;
            
    //     if(x[n-1]==y[m-1])
    //         return 1+lcs(n-1,m-1,x,y);
            
    //     else 
    //         return max(lcs(n,m-1,x,y),lcs(n-1,m,x,y));
    // }
};


//{ Driver Code Starts.
int main()
{
    int t,n,m;
    cin>>t;
    while(t--)
    {
        cin>>n>>m;          // Take size of both the strings as input
        string s1,s2;
        cin>>s1>>s2;        // Take both the string as input
        Solution ob;
        cout << ob.lcs(n, m, s1, s2) << endl;
    }
    return 0;
}

// } Driver Code Ends