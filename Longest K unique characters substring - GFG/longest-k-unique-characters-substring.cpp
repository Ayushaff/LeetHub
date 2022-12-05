//{ Driver Code Starts
//Initial template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function template for C++

class Solution{
  public:
    int longestKSubstr(string s, int k) {
    // your code here
    unordered_map<int,int>mp;
    int i=0,j=0;
    int mx=-1;
    int n=s.length();
        while(j<n)
        {
            mp[s[j]]++;
            if(mp.size()<k)
                j++;
                
                else if(mp.size()==k) //mp.size() is the number of unique character == k
                {
                    mx=max(mx,j-i+1);
                    j++;
                }
                else if(mp.size()>k)    //if uniqness is more than k then move i++ and remove the calculations from i
                {
                    while(mp.size()>k)
                    {
                        mp[s[i]]--;
                        if(mp[s[i]]==0)
                            mp.erase(s[i]);    
                    i++;
                    }
                    j++;
                }
        }
        return mx;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        string s;
        cin >> s;
        int k;
        cin >> k;
        Solution ob;
        cout << ob.longestKSubstr(s, k) << endl;
    }
}

// } Driver Code Ends