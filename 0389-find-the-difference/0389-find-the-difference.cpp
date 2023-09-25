class Solution {
public:
    char findTheDifference(string s, string t) {
        unordered_map<char,int>m;
        char ans;
        for(int i=0;i<s.length()+1;i++)
        {
            m[t[i]]++;
            m[s[i]]--;
        }
        for(auto it:m){
        if(it.second==1)
            ans=it.first;
            }
        return ans;
  
    }
};
//         for(auto it:m){
//             cout<<it.first<<" "<<it.second<<endl;
//         }
        
