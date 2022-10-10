/*check half of the string,
replace a non 'a' character to 'a'.

If only one character, return empty string.

Otherwise repalce the last character to 'b'


Complexity
Time O(N)
Space O(N)
*/
class Solution {
public:
    string breakPalindrome(string p) {
          int n=p.size();

            
            for(int i=0;i<n/2;i++){
                if(p[i]!='a'){
                   p[i]='a';
                        return p;
                }                        
            }
            p[n-1]='b';
            return n<2?"":p;
    }
};