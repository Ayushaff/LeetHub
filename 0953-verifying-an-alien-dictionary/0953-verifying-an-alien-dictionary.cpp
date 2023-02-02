class Solution {
public:
    unordered_map<char,int> mp;
    bool compare(string& first,string& second){
        int m=first.length(),n=second.length();
        for(int i=0;i<min(m,n);i++) {
            
            if(mp[first[i]]<mp[second[i]])
                return true;
            else if(mp[first[i]]>mp[second[i]])
                return false;
        }
        if(n>=m) return true;
        return false;
    }

    bool isAlienSorted(vector<string>& words, string order) {

        for(int i=0;i<order.length();i++) 
            mp[order[i]]=i;
        int n=words.size();
        for(int i=0;i<n-1;i++){
            if(!compare(words[i],words[i+1])) return false;
        }
        return true;
    }
};
// class Solution {
// public:
//     bool isAlienSorted(vector<string>& words, string order) {
//         map<char,int> mp;
//         for(int i=0;i<order.size();i++) mp[order[i]]=i+1; 
//         for(int i=0;i<words.size();i++){
//             for(int j=i+1;j<words.size();j++){
//                 int m=0;
//                 int cnt=0;
//                 while(m<min(words[i].size(),words[j].size())){
//                     //cout<<mp[words[i][m]]<<" "<<mp[words[j][m]]<<endl;
//                     if(mp[words[i][m]]<mp[words[j][m]]) break;
//                     else if(mp[words[i][m]]==mp[words[j][m]]) cnt++;
//                     else return false;
//                     m++;
//                 }
//                 if(cnt==min(words[i].size(),words[j].size())&&words[i].size()>words[j].size()) return false;
//             }
//         }
//         return true;
//     }
// };