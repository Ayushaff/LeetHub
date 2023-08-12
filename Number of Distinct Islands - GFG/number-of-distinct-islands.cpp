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
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

// User function Template for C++
class Solution {
private:
    // DFS function to traverse and mark island cells
    void dfs(int row, int col, vector<vector<int>>& vis, vector<vector<int>>& mat, vector<pair<int,int>>& vec, int brow, int bcol) {
        vis[row][col] = 1;

        // Add relative cell position to the list (cell-base)
        vec.push_back({row - brow, col - bcol});
        int n = mat.size();
        int m = mat[0].size();

        // Traverse neighbors in 4 directions
        int drow[] = {-1, 0, 1, 0};
        int dcol[] = {0, 1, 0, -1};

        for (int i = 0; i < 4; i++) {
            int nrow = row + drow[i];
            int ncol = col + dcol[i];
            // check for valid unvisited land neighbour coordinates 
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && !vis[nrow][ncol] && mat[nrow][ncol] == 1) {
                dfs(nrow, ncol, vis, mat, vec, brow, bcol);
            }
        }
    }

public:
    int countDistinctIslands(vector<vector<int>>& mat) {
        int n = mat.size();
        int m = mat[0].size();
        
        // Create a 2D array to mark visited cells
        vector<vector<int>> vis(n, vector<int>(m, 0));
        
        // Set to store distinct island configurations
        set<vector<pair<int,int>>> st;

        // Traverse the grid to find distinct islands
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                 // if not visited and is a land cell
                if (!vis[i][j] && mat[i][j] == 1) {
                    // Found an island
                    vector<pair<int,int>> vec;
                    dfs(i, j, vis, mat, vec, i, j);
                    // store in set
                    st.insert(vec);
                }
            }
        }
        return st.size(); // Return the count of distinct islands
    }
};

// Driver Code Ends


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