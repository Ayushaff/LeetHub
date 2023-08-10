//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution{
    private :
    void dfs(int row,int col,vector<vector<int>>& vis,vector<vector<char>> &mat,int drow[],int dcol[]){
        int n=mat.size() , m=mat[0].size();
    vis[row][col]=1;
    //check for top right bottom left
    
    
    for(int i=0;i<4;i++){
        int nrow=row+drow[i];
        int ncol=col+dcol[i];
        if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && !vis[nrow][ncol] && mat[nrow][ncol]=='O'){
            dfs(nrow,ncol,vis,mat,drow,dcol);
        }
    }
    
}
public:

    vector<vector<char>> fill(int n, int m, vector<vector<char>> mat)
    {
       int drow[] = {-1, 0, 1, 0};
        int dcol[]={0,1,0,-1};
        // code here
        vector<vector<int>>vis(n,vector<int>(m,0));
        //traverse first row , first col ,last row,last col
        
        //traverse first row , last row
        for(int j=0;j<m;j++){
            if(!vis[0][j] && mat[0][j]=='O')//first row
            {
                dfs(0,j,vis,mat,drow,dcol);
            }
            if(!vis[n-1][j] && mat[n-1][j]=='O'){
                dfs(n-1,j,vis,mat,drow,dcol );
            }
        }
        
        //traverse first col , last col
        for(int i=0;i<n;i++){
            if(!vis[i][0] && mat[i][0]=='O')//first row
            {
                dfs(i,0,vis,mat,drow,dcol);
            }
            if(!vis[i][m-1] && mat[i][m-1]=='O'){
                dfs(i,m-1,vis,mat,drow,dcol);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && mat[i][j]=='O')//such 'O' are not touched with such 'O' those are touches with boundaries and are covered by 'X' 
                    mat[i][j]='X';
            }
        }
        return mat;
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int n, m;
        cin>>n>>m;
        vector<vector<char>> mat(n, vector<char>(m, '.'));
        for(int i = 0;i < n;i++)
            for(int j=0; j<m; j++)
                cin>>mat[i][j];
        
        Solution ob;
        vector<vector<char>> ans = ob.fill(n, m, mat);
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < m;j++) {
                cout<<ans[i][j]<<" ";
            }
            cout<<"\n";
        }
    }
    return 0;
}
// } Driver Code Ends