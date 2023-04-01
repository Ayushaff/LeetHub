//{ Driver Code Starts
//Initial template for C++

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function template for C++

class Solution
{
    public:
    
void print(stack<int> &st)
{
    while (!st.empty())
    {
        cout << st.top() <<" ";
        st.pop();
    }
}
void solve(stack<int> &st, int k)
{
    if (k == 1){
        st.pop();
        return ;
    }
    
    int temp=st.top();
    st.pop();
    solve(st,k-1);
    st.push(temp);
    return;
}


    void deleteMid(stack<int>&s, int sz)
    {
        // code here.. 
        int k=0;
        k=(sz/2)+1;
        solve(s,k);
        print(s);
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin>>t;
    
    while(t--)
    {
        int sizeOfStack;
        cin>>sizeOfStack;
        
        stack<int> myStack;
        
        for(int i=0;i<sizeOfStack;i++)
        {
            int x;
            cin>>x;
            myStack.push(x);    
        }

            Solution ob;
            ob.deleteMid(myStack,myStack.size());
            while(!myStack.empty())
            {
                cout<<myStack.top()<<" ";
                myStack.pop();
            }
        cout<<endl;
    }   
    return 0;
}

// } Driver Code Ends