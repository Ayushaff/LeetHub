class Solution {
public:
    bool checkIfPangram(string sentence) {
        vector<int>v(26,0); //freq
            int cnt=0;
            for(int i=0;i<sentence.size();i++){
                    if(v[sentence[i]-97]==0)
                            cnt++;
                     v[sentence[i]-97]=1;
            }
            return cnt==26;
    }
};