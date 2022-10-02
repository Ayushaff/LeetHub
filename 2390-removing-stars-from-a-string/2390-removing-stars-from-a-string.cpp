class Solution {
public:
            string removeStars(string s) {
    int j = 0;
    for (int i = 0; i < s.size(); ++i)
        if (s[i] == '*')
            j--;
        else {
             //   cout<<"1 "<<j<<" "<<i<<endl;

            s[j] = s[i];
                j++;
                //cout<<"2 "<<j<<" "<<i<<endl;
        }
                    cout<<j;
    return s.substr(0,j);
    }
};
    /*    stack<char>st;
            for(int i=0;i<s.length();i++){
                    if(s[i]!='*'){
                            st.push(s[i]);
                    }else{
                            st.pop();
                    }
            }
            if(st.empty())
                    return "";
            string ss;
            while(!st.empty()){
                    ss+=st.top() ,st.pop();
            }
            reverse(ss.begin(),ss.end());
            return ss;
    }
};*/