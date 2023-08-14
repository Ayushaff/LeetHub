//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                adj.get(u).add(v);
            }

            Solution obj = new Solution();
            List<Integer> safeNodes = obj.eventualSafeNodes(V, adj);
            for (int i : safeNodes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//just check if theres any nodes who makes the cycle
// the nodes who doestnt make will be out of for loop and can add them in check
  //if a node has any adj nodes just check such cyclic conditions if not cycle add that node in check array 
class Solution {
    boolean dfs(int node, List<List<Integer>> adj,int[]vis,int pathvis[],int check[])
    {
        vis[node]=1;
        pathvis[node]=1;
        check[node]=0;
        for(int it:adj.get(node))
        {
            //if a node has any adj nodes just check such cyclic conditions and if that node doest satisy u such conditions to be true its the safe node and should be goin into check array
            if(vis[it]==0)
            {
                if(dfs(it,adj,vis,pathvis,check)==true)
                {
                    check[node]=0;
                    return true;
                }
            }
            else if(pathvis[it]==1)
            {
                check[node]=0;
                return true;
            }
        }
        check[node]=1;
        // System.out.println(check[node]);
        pathvis[node]=0;
        return false;
    }
    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {

        // Your code here
        int vis[]=new int[V];
        int pathvis[]=new int[V];
        int check[]=new int [V];
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            if(vis[i]==0)
            {
                dfs(i,adj,vis,pathvis,check);
            }
        }
        for(int i=0;i<V;i++)
        {
            if(check[i]==1)
            {
                l.add(i);
            }
        }
        return l;
    }
}
