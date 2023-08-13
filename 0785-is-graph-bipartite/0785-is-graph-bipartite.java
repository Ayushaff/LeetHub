
class Solution {
    private boolean dfs(int node,int color,int colors[],int adj[][]){
        colors[node]=color;

        for(int i:adj[node]){
            if(colors[i]==-1){
                if(dfs(i,1-color,colors,adj)==false)
                    return false;
            }
            else if(colors[i]==color){
                return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;

        int colors[]=new int[n];
        for(int i=0;i<n;i++){
            colors[i]=-1;
        }

        //check for non colored
        for(int i=0;i<n;i++){
            if(colors[i]==-1){
                if(dfs(i,1,colors,graph)==false)
                return false;
            }
        }
        return true;
    }
}