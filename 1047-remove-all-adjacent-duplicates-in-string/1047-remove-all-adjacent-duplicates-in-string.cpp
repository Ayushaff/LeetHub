class Solution {
public:
    string removeDuplicates(string s) {
         string ans="";
        for(char i:s){
            if(ans.size()==0)ans.push_back(i);//if empty just push each elements of string s
            else if(i==ans.back())ans.pop_back();//if mathed with next element remove last element pushed in ans string
            else ans.push_back(i);//else just push the element simply
        }
        return ans;
    }
};