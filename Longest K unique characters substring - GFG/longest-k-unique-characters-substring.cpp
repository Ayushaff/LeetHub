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
              //Sliding Window Condition: hashmap.size = k  [OR number of Unique Characters =k];
          if(mp.size()>k)
          {
               /*Reduce the frequency of ith element by 1 and remove it from map if frequency becomes 0.
                                                 Keep doing above [reducing window size] till hm.size becomes <=k  */
                while(mp.size()>k)
                {
                    mp[s[i]]--;
                    
                    if(mp[s[i]]==0)
                    {
                        mp.erase(s[i]);
                    }  
                    i++;
                }
          }
              if(mp.size()==k)//unique chars = k , compute candidate answer.
              {
                  int tempans=j-i+1;
                  mx=max(mx,tempans);
              }
          j++;// increase window size and look for next window where sum = target
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