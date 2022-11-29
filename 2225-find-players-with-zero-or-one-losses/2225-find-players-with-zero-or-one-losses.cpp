class Solution {
public:
    vector<vector<int>> findWinners(vector<vector<int>>& matches) {
        unordered_map<int,int>win,lose;
        vector<vector<int>>ans(2);
        
        for(auto i:matches){
            win[i[0]]++;
            lose[i[1]]++;
        }
        
        for(auto i:lose){
            if(i.second==1)
                ans[1].push_back(i.first);
        }
        
        for(auto i:win){
            if(lose.find(i.first)==lose.end())
                ans[0].push_back(i.first);
        }
        sort(ans[0].begin(),ans[0].end());
        sort(ans[1].begin(),ans[1].end());
        return ans;
    }
};