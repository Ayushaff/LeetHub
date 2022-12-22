//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{

	public:
	long long subCount(long long nums[], int n, long long k)
	{
	    // Your code goes here
 unordered_map<int,int>mp;
        mp[0]=1;
        int sum=0;
        int ans=0; 
        int rem=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            rem=sum%k;
            if(rem<0)
                rem+=k;

            if(mp[rem]>=1)
            {
                ans+=mp[rem];
                mp[rem]++;
            }
            else
            mp[rem]=1;
        }
        return ans;
        }
};



//{ Driver Code Starts.

int main() 
{
   
   	int t;
    cin >> t;
    while (t--)
    {
    	int n;
       	long long k;
		cin>>n >> k;
		long long a[n];
		for(int i=0;i<n;++i)
			cin>>a[i];
        

        Solution ob;
        cout << ob.subCount(a, n, k);
	    cout << "\n";
	     
    }
    return 0;
}

// } Driver Code Ends