//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution
{
	public:
	//Function to find the level of node X.
	int nodeLevel(int v, vector<int> adj[], int X) 
	{
	    // code here
	    queue<pair<int,int>>q;
	    vector<int>vis(v,0);
	    q.push({0,0});
	    vis[0]=1;
	    while(!q.empty()){
	        pair<int,int>p=q.front();
	        q.pop();
	        
	        //traverse bfs
	        int node=p.first;
	        int dist=p.second;
	        
	        if(node==X)return dist;
	        for(auto it:adj[node]){
	            if(!vis[it]){
	                q.push({it,dist+1});
	                vis[it]=1;
	            }
	        }
	    }
	        return -1;
	}
};

//{ Driver Code Starts.


int main()
{
    
    int t;
    cin >> t;
    while(t--)
    {
    	int V, E, X;
    	cin >> V >> E;

    	vector<int> adj[V];

    	for(int i = 0; i < E; i++)
    	{
    		int u, v;
    		cin >> u >> v;
    		adj[u].push_back(v);
    		adj[v].push_back(u);
    	}
    	cin>>X;

    	Solution obj;
    	cout << obj.nodeLevel(V, adj, X) << "\n";
    }

    return 0;
}


// } Driver Code Ends