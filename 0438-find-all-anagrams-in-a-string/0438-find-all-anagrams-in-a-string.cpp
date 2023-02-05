class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        if(s.size()<p.size()) return {};
        vector<int> fq(26,0),win(26,0),res;
        int j=0,i;
        for(i=0;i<p.size();i++){fq[p[i]-'a']++;win[s[i]-'a']++;}
        if(fq==win) res.push_back(j);
        while(i<s.size()){
            win[s[j]-'a']--;
            win[s[i]-'a']++;
            if(win==fq) res.push_back(j+1);
            i++;
            j++;
        }
        return res;
    }
};