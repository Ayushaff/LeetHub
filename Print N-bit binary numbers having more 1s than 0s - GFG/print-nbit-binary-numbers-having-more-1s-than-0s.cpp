//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function template for C++
class Solution{
public:	
void solve(int o,int z,string op,vector<string>&res,int n){
    
    if(n==0){
        res.push_back(op);
        return;
    }
    string op1=op;
    solve(o+1,z,op1+'1',res,n-1);
    if(o>z){
        string op2=op;
        solve(o,z+1,op2+'0',res,n-1);
    }
    return;
}
	vector<string> NBitBinary(int n)
	{
	    // Your code goes here
	    vector<string>res;
	    int one=0,zero=0;
	    string op="";
	    solve(one,zero,op,res,n);
	    return res;
	}
};

//{ Driver Code Starts.

int main() 
{
   	

   	ios_base::sync_with_stdio(0);
    cin.tie(NULL);
    cout.tie(NULL);
   
   	int t;
   	cin >> t;
   	while(t--)
   	{
   		int n;
   		cin >> n;
        Solution ob;
   		vector<string> ans = ob.NBitBinary(n);

   		for(auto i:ans)
   			cout << i << " ";

   		cout << "\n";
   	}

    return 0;
}
// } Driver Code Ends