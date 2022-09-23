class Solution {
public:
    char findTheDifference(string s, string t) {
         char a='0';
            for(auto i:s)
                    a^=i;
            
            for(auto i:t)
                    a^=i;
            a^='0';
            return a;
    }
};