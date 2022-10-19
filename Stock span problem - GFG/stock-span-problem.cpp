//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends


class Solution
{
    public:
    //Function to calculate the span of stockâ€™s price for all n days.
    vector <int> calculateSpan(int arr[], int n)
    {
        //soln based on concept NGL verma playlist
        vector<int>v ;//stores indexes of ngl
        stack<pair<int,int>>st;
        for(int i=0;i<n;i++){
            if(st.size()==0)
                v.push_back(-1);
                
                else if(!st.empty() && st.top().first > arr[i])
                    v.push_back(st.top().second);
                    
                else if(!st.empty() && st.top().first<=arr[i]){
                    
                    while(!st.empty() && st.top().first <= arr[i])
                        st.pop();
                    if(st.size()==0)
                    v.push_back(-1);
                    else 
                    v.push_back(st.top().second);
                    
                }
            st.push({arr[i],i});
        }
        for(int i=0;i<v.size();i++)
        v[i]=i-v[i];
        return v;
    }
};
  /*     
       //storing indexes in stack
       vector<int>v;
       stack<int>st;
       for(int i=0;i<n;i++){
            
            while(!st.empty() && price[st.top()]<= price[i])       
                st.pop();
                
            int res=(st.empty()) ? i+1 : i - st.top();  //i is index of current element's 
                                                //and st.top() is index of greater element's
            
                st.push(i);
                v.push_back(res);
                 
       }
       return v;
    }
};
*/


//{ Driver Code Starts.

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		int i,a[n];
		for(i=0;i<n;i++)
		{
			cin>>a[i];
		}
		Solution obj;
		vector <int> s = obj.calculateSpan(a, n);
		
		for(i=0;i<n;i++)
		{
			cout<<s[i]<<" ";
		}
		cout<<endl;
	}
	return 0;
}

// } Driver Code Ends