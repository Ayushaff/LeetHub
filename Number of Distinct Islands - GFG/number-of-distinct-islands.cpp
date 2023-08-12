//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++
/*
Algorithm:

1 Define the dfs function to traverse and mark island cells. Within this function, add the relative cell position to the list (cell-base).
2 Define the countDistinctIslands function to find the count of distinct islands using Depth-First Search (DFS).
3 Create a 2D array vis to mark visited cells.
4 Create an empty set st to store distinct island configurations.
5 Traverse the grid using nested loops.
* If a cell is unvisited and represents an island (value is 1), start DFS traversal.
* For each island found, store its unique configuration in the set st.
6 Return the size of the set st, which represents the count of distinct islands.

*/
class Solution {
private:
    void dfs(int row, int col, vector<vector<int>>& vis, vector<vector<int>>& mat, vector<pair<int,int>>& vec, int brow, int bcol) {
        vis[row][col] = 1;
        
        vec.push_back({row - brow, col - bcol}); // Making a list of cell-base
        int n = mat.size();
        int m = mat[0].size();
        
        // Traverse neighbors in 4 directions
        int drow[] = {-1, 0, 1, 0};
        int dcol[] = {0, 1, 0, -1};
        
        for (int i = 0; i < 4; i++) {
            int nrow = row + drow[i];
            int ncol = col + dcol[i];
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && !vis[nrow][ncol] && mat[nrow][ncol] == 1) {
                dfs(nrow, ncol, vis, mat, vec, brow, bcol);
            }
        }
    }

public:
    int countDistinctIslands(vector<vector<int>>& mat) {
        int n = mat.size();
        int m = mat[0].size();
        
        vector<vector<int>> vis(n, vector<int>(m, 0)); 
        set<vector<pair<int,int>>> st;
        
        // Traverse to find the first island
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!vis[i][j] && mat[i][j] == 1) {
                    // Found an island
                    vector<pair<int,int>> vec;
                    dfs(i, j, vis, mat, vec, i, j); 
                    st.insert(vec); 
                }
            }
        }
        return st.size();
    }
};



//{ Driver Code Starts.

int main() {

    int t;
    cin >> t;
    while (t--) {
        int n, m;
        cin >> n >> m;
        vector<vector<int>> grid(n, vector<int>(m));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cin >> grid[i][j];
            }
        }
        Solution obj;
        cout << obj.countDistinctIslands(grid) << endl;
    }
}
// } Driver Code Ends