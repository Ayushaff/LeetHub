//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution {
public:
    vector<int> eventualSafeNodes(int V, vector<int> adj[]) {
        vector<int> safeNodes;
        vector<int> outDegrees(V, 0);
        vector<vector<int>> reverseGraph(V);
        
        for (int i = 0; i < V; i++) {
            reverseGraph[i] = vector<int>();
        }
        
        for (int i = 0; i < V; i++) {
            for (int neighbor : adj[i]) {
                outDegrees[i]++;
                reverseGraph[neighbor].push_back(i);
            }
        }
        
        queue<int> q;
        
        for (int i = 0; i < V; i++) {
            if (outDegrees[i] == 0) {
                q.push(i);
            }
        }
        
        while (!q.empty()) {
            int node = q.front();
            q.pop();
            safeNodes.push_back(node);
            
            for (int neighbor : reverseGraph[node]) {
                if (--outDegrees[neighbor] == 0) {
                    q.push(neighbor);
                }
            }
        }
        
        sort(safeNodes.begin(), safeNodes.end());
        return safeNodes;
    }
};



//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {

        int V, E;
        cin >> V >> E;
        vector<int> adj[V];

        for (int i = 0; i < E; i++) {
            int u, v;
            cin >> u >> v;
            adj[u].push_back(v);
        }

        Solution obj;
        vector<int> safeNodes = obj.eventualSafeNodes(V, adj);
        for (auto i : safeNodes) {
            cout << i << " ";
        }
        cout << endl;
    }
}

// } Driver Code Ends