class Solution {
public:
    string countAndSay(int n) {
        //base
            if(n==1)return "1";
            if(n==2)return "11";
            string s="11";
            for(int i=3;i<=n;i++){
                    string temp="";
                    s+='~'; //DEDLIMITER 
                    int count=1;
                    
                    for(int j=1;j<s.length();j++){
                            if(s[j]!=s[j-1]){
                            temp+=to_string(count);//count stored
                            temp+=s[j-1]; //character which was not equal
                                    count=1;
                            }
                            else
                                    count++;
                            
                    }
                    s=temp;
            }
            return s;
    }
};

/*
class Solution:
    def countAndSay(self, n: int) -> str:
        s = '1'
        for _ in range(n-1):
            prev, temp, count = s[0], '', 0
            for curr in s:
                if prev == curr:
                    count += 1
                else:
                    temp += str(count)+prev
                    prev = curr
                    count = 1
            temp += str(count)+prev
            s = temp
        return s
    
        
*/

