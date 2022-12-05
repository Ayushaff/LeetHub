class Solution {
public:
    int lengthOfLongestSubstring(string s) {
   
    unordered_map<int,int>mp;
    int i=0,j=0;
    int mx=0;
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
              if(mp.size()==j-i+1)//unique chars = k , compute candidate answer.
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
};
        /*vector<int> dict(256, -1);
        int maxLen = 0, start = -1;
        for (int i = 0; i != s.length(); i++) {
            if (dict[s[i]] > start)
                start = dict[s[i]];
            dict[s[i]] = i;
            maxLen = max(maxLen, i - start);
        }
        return maxLen;
    }
};*/