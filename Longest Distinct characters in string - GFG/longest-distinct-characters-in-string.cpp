//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;
int longestSubstrDistinctChars (string S);
int main()
{
    int t; cin >> t;
    while (t--)
    {
        string S; cin >> S;

        cout << longestSubstrDistinctChars (S) << endl;
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


int longestSubstrDistinctChars (string s)
{
    // your code here
       // your code here
    unordered_map<int,int>mp;
    int i=0,j=0;
    int mx=-1;
    int n=s.length();
        while(j<n)
        {
            mp[s[j]]++;
            
        if(mp.size()>j-i+1)
          {
               /*Reduce the frequency of ith element by 1 and remove it from map if frequency becomes 0.
                                                 Keep doing above [reducing window size] till hm.size becomes <=k  */
                while(mp.size()>j-i+1)
                {
                    mp[s[i]]--;
                    
                    if(mp[s[i]]==0)
                    {
                        mp.erase(s[i]);
                    }  
                    i++;
                }
          }
              if(mp.size()==j-i+1)//unique chars = k , compute candidate answer.    window size and mp.size same so it can be the ans
              {
                  int tempans=j-i+1;
                  mx=max(mx,tempans);
              }
              else if(mp.size()<j-i+1)
              {
                  mp[s[i]]--;
                   if(mp[s[i]]==0)
                    {
                        mp.erase(s[i]);
                    }  
                    i++;
              }
          j++;// increase window size and look for next window where sum = target
        }
        return mx;
}