class Solution {
public:
      vector<string> findAndReplacePattern(vector<string> words, string p) {
        vector<string> res;
        for (string w : words) if (F(w) == F(p)) res.push_back(w);
        return res;
    }

    string F(string w) {
        unordered_map<char, int> m;
        for (char c : w) if (!m.count(c)) m[c] = m.size();
        for (int i = 0; i < w.length(); ++i) w[i] = 'a' + m[w[i]];
        return w;
    }
//     string getPattern(string pattern){
        
//         string ans;
//         map<char,char>mp;
//         int j=0;
//         for(int i=0;i<pattern.size();i++)
//         {
            
//             if(mp.find(pattern[i])==mp.end())
//             {
                
//                 mp[pattern[i]]='a'+j;
//                 j++;
//             }
//             else{
//                 ans.push_back(mp[pattern[i]]);
//             }
           
//         }  
//          return ans;
//     }
//     vector<string> findAndReplacePattern(vector<string>& words, string pattern) {
        
//         string pat=getPattern(pattern);
//         vector<string>ans;
        
//         for(int i=0; i<words.size();i++){
//             string w=getPattern(words[i]);
            
//             if(pat==w)
//                 ans.push_back(words[i]);
//         }            
//         return ans;
//     }
};