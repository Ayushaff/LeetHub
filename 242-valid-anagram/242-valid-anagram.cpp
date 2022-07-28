class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.size()!=t.size()) return 0;
        
        map<char,int>sc,tc;
        
        for(int i=0;i<s.size();i++){
            sc[s[i]]++;
            tc[t[i]]++;
        }
        //map<char,int>::iterator x=sc.begin();
        for(auto x:sc){
            if(sc[x.first]!=tc[x.first])return 0;
        }
          return 1;
    }
  
};