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


class Solution
{
    private boolean dfs(int node,int color,int colors[],ArrayList<ArrayList<Integer>>adj){
        colors[node]=color;
        //traverse adj nodes of it
        
        for(int it:adj.get(node))
        {
            if(colors[it]==-1){//if not visited to that adj node
                //just color it opposite
                if(dfs(it,1-color,colors,adj)==false)
                    return false;
            }
            //if already colored
            else if(colors[it]==color)//check if its same colored as the node 
                {
                    return false;
                }
        }
        return true;
    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int colors[]=new int [V];
        for(int i=0;i<V;i++)colors[i]=-1;
        // Arrays.fill(colors,-1);
        
        for(int i=0;i<V;i++){
            if(colors[i]==-1){
                if(dfs(i,0,colors,adj)==false)
                    return false;
            }
        }
        return true;
    }
}