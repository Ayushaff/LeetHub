//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution
{
public:
long long getMaxArea(long long arr[], int n)
    {
        // Your code here
        
        //nsl
        
        vector<long long>nsl;
        stack<long long>st1;
        
        //
        for(int i=0;i<n;i++)
        {
            while(!st1.empty() && arr[st1.top()]>=arr[i])
                st1.pop();
                
                if(st1.empty())
                    nsl.push_back(-1);
                    else
                    nsl.push_back(st1.top());
                    
            st1.push(i);
        }
        //nsr
        
        
         vector<long long> nsr;
          stack<long long> st2;
            
          for(int i=n-1;i>=0;i--)
          {
              //cout<<arr[i]<<endl;
              
              while(!st2.empty()&&arr[st2.top()]>=arr[i])
                      st2.pop();

              if(st2.empty())
                  nsr.push_back(n);         // pseudo index after last index 
                else
                  nsr.push_back(abs(st2.top()));
 
              st2.push(i);
          }
          reverse(nsr.begin(),nsr.end());
          
            
        //width
        long long maxx=0;
          for(int i=0;i<nsr.size();i++)
            {
                
                long long curr = ((nsr[i]-nsl[i])-1) * arr[i];
                maxx=max(maxx,curr);
            }
            
            return maxx;
    }
};
  /*  {
      
    
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
*/

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