//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;


// } Driver Code Ends
//User function template for C++
class Solution{
public:
	int search(string p, string s) {
	    
	    unordered_map<char,int>mp;
	    int ans=0;
	    
	    //storing occ. for string p
	    for(auto &x: p)
	        mp[x]++;
	        
	    int count=mp.size();
	    int k=p.size();
	    int i=0,j=0;
	    
	    while(j<s.size())
	    {
	        //calculation part
	        if(mp.find(s[j])!=mp.end())
	        {
	            mp[s[j]]--;
	            
	            if(mp[s[j]]==0)
	                count--;
	        }
	        
	        //if window size isnt achieved yet
	        if((j-i+1)<k)
	            j++;
	            
	            //window length achived 
	            //i) find ans 
	            //ii) slide window
	            else if((j-i+1)==k)
	            {
	                //i) ans
	                if(count==0)
	                    ans++;
	                    
                    if(mp.find(s[i])!=mp.end()){
                        mp[s[i]]++;
                        
                        if(mp[s[i]]==1)
                            count++;
                    }
                    i++,j++;
	            }
	    }   //while
	    return ans;
	}

};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        string pat, txt;
        cin >> txt >> pat;
        Solution ob;
        auto ans = ob.search(pat, txt);
        cout << ans << "\n";
    }
    return 0;
}
// } Driver Code Ends