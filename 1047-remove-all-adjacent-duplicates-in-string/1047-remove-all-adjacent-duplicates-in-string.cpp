class Solution {
public:
    string removeDuplicates(string s) {
            
            stack<char>st;
            for(int i=0;i<s.size();i++){
                    if(st.empty())
                            st.push(s[i]);
                    else if(st.top()==s[i])
                            st.pop();
                    else st.push(s[i]);
            }
            string a="";
            while(!st.empty()){
                    a+=st.top();
                    st.pop();
            }
            reverse(a.begin(),a.end());
            return a;
    }
};
            
            /*
            without stack optimal
         string ans="";
        for(char i:s){
            if(ans.size()==0)ans.push_back(i);//if empty just push each elements of string s
            else if(i==ans.back())ans.pop_back();//if mathed with next element remove last element pushed in ans string
            else ans.push_back(i);//else just push the element simply
        }
        return ans;
    }
};*/