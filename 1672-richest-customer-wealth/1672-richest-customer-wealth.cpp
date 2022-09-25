class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int w=0;
            int row=accounts.size() ,col=accounts[0].size();
            
            for(int i=0;i<row;i++){
                    int maxw=0;
                    for(int j=0;j<col;j++){
                            maxw+=accounts[i][j];
                    }
                    w=max(w,maxw);
            }
            
            return w;
    }
};