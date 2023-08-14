
//just check if theres any nodes who makes the cycle
// the nodes who doestnt make will be out of for loop and can add them in check
  //if a node has any adj nodes just check such cyclic conditions if not cycle add that node in check array 
class Solution {
    boolean dfs(int node, int[][]graph,boolean[]vis,boolean pathvis[],boolean check[])
    {
        vis[node]=true;
        pathvis[node]=true;
        check[node]=false;
       
        for(int it:graph[node])
        {
            //if a node has any adj nodes just check such cyclic conditions and if that node doest satisy u such conditions to be true its the safe node and should be goin into check array
            if(vis[it]==false)
            {
                if(dfs(it,graph,vis,pathvis,check)==true)
                {
                    check[it]=false;
                    return true;
                }
            }
            else if(pathvis[it]==true)
            {
                check[it]=false;
                return true;
            }
        
        }
        check[node]=true;
        // System.out.println(check[node]);
        pathvis[node]=false;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {

        // Your code here
        int V=graph.length;
        
        boolean vis[]=new boolean[V];
        boolean pathvis[]=new boolean[V];
        boolean check[]=new boolean [V];
        
       
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            if(vis[i]==false)
            {
                dfs(i,graph,vis,pathvis,check);
            }
        }
        for(int i=0;i<V;i++)
        {
            if(check[i]==true)
            {
                l.add(i);
            }
        }
        return l;
    }
}
