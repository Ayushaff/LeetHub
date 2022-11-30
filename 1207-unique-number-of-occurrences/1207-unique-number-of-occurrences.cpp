class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        unordered_map<int,int>mp;
        for(int i:arr)
            mp[i]++;
        
        unordered_set<int>set;
        for(auto [key,value]:mp)
            set.insert(value);
        
        return mp.size()==set.size();
    }
};