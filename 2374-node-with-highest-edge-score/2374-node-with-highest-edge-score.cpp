class Solution {
public:
    int edgeScore(vector<int>& edges) {
        map<int,long long int>mp;
        
        for(int i=0;i<edges.size();i++){
            mp[edges[i]]+=i;
        }
        int ans=0;
        long long int hi=0;
        for(auto x: mp){
            if(x.second>hi){
                hi=x.second;
                ans=x.first;
            }
        }
        return ans;
    }
};