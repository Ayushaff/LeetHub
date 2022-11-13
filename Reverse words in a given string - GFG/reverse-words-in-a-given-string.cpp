//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution
{
    public:
    //Function to reverse words in a given string.
    string reverseWords(string s) 
    { 
        // code here
        stack<string>st;
        string temp="";
        for(int i=0;i<s.length();i++){
            if(s[i]!='.'){
                temp+=s[i];
            }
            else{
                st.push(temp);
                temp="";
            }
        }
        st.push(temp);
        string res="";
            while(!st.empty()){
                string str=st.top();
                st.pop();
                res+=str+".";
            }
            res.pop_back();
            return res;
    } 
};

//{ Driver Code Starts.
int main() 
{
    int t;
    cin >> t;
    while (t--) 
    {
        string s;
        cin >> s;
        Solution obj;
        cout<<obj.reverseWords(s)<<endl;
    }
}
// } Driver Code Ends