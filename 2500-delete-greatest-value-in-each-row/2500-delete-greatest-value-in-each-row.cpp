class Solution {
public:
    int deleteGreatestValue(vector<vector<int>>& grid) 
    {
        int n=grid[0].size();
        int ans=0;
        int r=grid.size();
        vector<priority_queue<int>> pq(r);
        int c=grid[0].size();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                pq[i].push(grid[i][j]);
            }
        }
    
        while(n--)
        {
            int tmp=INT_MIN;
            for(int i=0;i<r;i++)
            {
                tmp=max(tmp,pq[i].top());
                pq[i].pop();
            }
            ans+=tmp;
        }
        return ans;
        
    }
};