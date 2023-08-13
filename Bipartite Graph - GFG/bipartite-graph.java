//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int V = Integer.parseInt(S[0]);
            int E = Integer.parseInt(S[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for(int i = 0; i < V; i++){
                adj.add(new ArrayList<Integer>());
            }
            for(int i = 0; i < E; i++){
                String[] s = br.readLine().trim().split(" ");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isBipartite(V, adj);
            if(ans)
                System.out.println("1");
            else System.out.println("0");
       }
    }
}
// } Driver Code Ends

// Initialize an array colors[] of size V to keep track of the color of each node. Initialize all elements of the array to -1, indicating that no nodes are colored yet.

// 1)For each node i from 0 to V-1, if the node is not yet colored, perform the following steps:
// a. Start a DFS traversal from node i.
// b. During the traversal, color the current node with the color 0.
// c. For each adjacent node it of the current node:

// 2)If the adjacent node it is not visited (color is -1), recursively color it with the opposite color (1 - color).
// If the adjacent node it is already colored and has the same color as the current node, return false indicating that the graph is not bipartite.
// d. If the traversal completes without any conflicts, return true indicating that the current component is bipartite.

// 3)If all components in the graph are found to be bipartite, return true. Otherwise, return false.

// In simple terms, the algorithm colors the nodes in the graph with two different colors, ensuring that no two adjacent nodes have the same color. If it is possible to color all nodes in such a way, then the graph is bipartite.

// The DFS traversal explores each connected component of the graph and colors the nodes while checking for conflicts. If a conflict is found during the traversal, the graph is not bipartite. If the traversal completes without conflicts for all components, then the graph is bipartite.
class Solution {
    // Helper function for DFS traversal
    private boolean dfs(int node, int color, int colors[], ArrayList<ArrayList<Integer>> adj) {
        colors[node] = color; // Color the current node with the specified color

        // Traverse adjacent nodes
        for (int it : adj.get(node)) {
            if (colors[it] == -1) { // If the adjacent node is not visited
                // Recursively color the adjacent node with the opposite color
                if (!dfs(it, 1 - color, colors, adj)) {
                    return false; // If coloring is not possible, return false
                }
            } else if (colors[it] == color) {
                return false; // If the adjacent node has the same color as the current node, return false
            }
        }
        return true; // If coloring is successful, return true
    }

    // Main function to check if the graph is bipartite
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj) {
        int colors[] = new int[V]; // Array to store colors of nodes
        for (int i = 0; i < V; i++) {
            colors[i] = -1; // Initialize all nodes as uncolored
        }

        // Check each component in the graph
        for (int i = 0; i < V; i++) {
            if (colors[i] == -1) { // If the node is uncolored
                // Start DFS traversal from this node and color it with color 0
                if (!dfs(i, 0, colors, adj)) {
                    return false; // If coloring is not possible, graph is not bipartite
                }
            }
        }
        return true; // If all components are bipartite, return true
    }
}
