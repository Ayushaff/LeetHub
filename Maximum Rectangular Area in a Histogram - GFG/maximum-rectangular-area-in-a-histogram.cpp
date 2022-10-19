//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution
{
    public:
 

long long getMaxArea(long long arr[], int n)
    {
      
    
          long long max_area=0;  
           
          stack<long long> stk;
          vector<long long> left;
          
          for(int i=0;i<n;i++)
          {
              while(!stk.empty()&&arr[stk.top()]>=arr[i])
                      stk.pop();
              if(stk.empty())
                  left.push_back(-1);    
              else
                  left.push_back(stk.top());
                 
              stk.push(i);
          }
          
          vector<long long> right;
          stack<long long> stk2;
            
          for(int i=n-1;i>=0;i--)
          {
              while(!stk2.empty()&&arr[stk2.top()]>=arr[i])
                      stk2.pop();
              if(stk2.empty())
                  right.push_back(n);         // pseudo index after last index 
              else
                  right.push_back(abs(stk2.top()));
                  
              stk2.push(i);
          }
          reverse(right.begin(),right.end());
            for(int i=0;i<right.size();i++)
            {
                long long curr=(right[i]-left[i]-1)*arr[i];
                max_area=max(max_area,curr);
            }
            
            return max_area;
        
    }
};


//{ Driver Code Starts.

int main()
 {
    long long t;

    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        
        long long arr[n];
        for(int i=0;i<n;i++)
            cin>>arr[i];
        Solution ob;
        cout<<ob.getMaxArea(arr, n)<<endl;
    
    }
	return 0;
}

// } Driver Code Ends