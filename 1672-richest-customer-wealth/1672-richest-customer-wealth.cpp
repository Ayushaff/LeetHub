class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int maxw=0;
            int row=accounts.size() ,col=accounts[0].size();
            
            for(int i=0;i<row;i++){
                    int w=0;
                    for(int j=0;j<col;j++){
                            w+=accounts[i][j];
                    }
                    maxw=max(maxw,w);
            }
            
            return maxw;
    }
};