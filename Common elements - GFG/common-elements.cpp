//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution
{
    public:    
       vector <int> commonElements (int a[], int b[], int c[], int n1, int n2, int n3)
        {
            
             int i=0,j=0,k=0;
        
        vector<int>v;
        
        while(i<n1&j<n2&&k<n3){
            if(a[i]==b[j]&&b[j]==c[k]){
                v.push_back(a[i]);
                i++,j++,k++;
            }
            else if(a[i]<b[j])i++;
            else if(b[j]<c[k])j++;
            else k++;
            
            
            int x=a[i-1];
            while(a[i]==x)i++;
            
            int y=b[j-1];
            while(b[j]==y)j++;
            
            int z=c[k-1];
            while(c[k]==z)k++;
            
        }
        if(v.size()==0)return {-1};
        return v;
        }
        //     //code here.
        //     unordered_map<int,int>m1,m2,m3;
        //     for(int i=0;i<n1;i++)m1[a[i]]++;
        //     for(int i=0;i<n2;i++)m2[b[i]]++;
        //     for(int i=0;i<n3;i++)m3[c[i]]++;
            
        //     vector<int>v;
        //     for(int i=0;i<n1;i++)
        //     if(m1[a[i]] &&m2[a[i]]&&m3[a[i]] ){
        //         v.push_back(a[i]);
        //         m1[a[i]]=0;
        //     }
        //     return v;
        // }

};

//{ Driver Code Starts.

int main ()
{
    int t; cin >> t;
    while (t--)
    {
        int n1, n2, n3; 
        cin >> n1 >> n2 >> n3;
        int A[n1];
        int B[n2];
        int C[n3];
        
        for (int i = 0; i < n1; i++) cin >> A[i];
        for (int i = 0; i < n2; i++) cin >> B[i];
        for (int i = 0; i < n3; i++) cin >> C[i];
        
        Solution ob;
        
        vector <int> res = ob.commonElements (A, B, C, n1, n2, n3);
        if (res.size () == 0) 
            cout << -1;
        for (int i = 0; i < res.size (); i++) 
            cout << res[i] << " "; 
        cout << endl;
    }
}
// } Driver Code Ends