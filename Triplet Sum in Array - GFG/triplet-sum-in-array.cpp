//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution{
    public:
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
  bool find3Numbers(int a[], int n, int X) {
    for (int i = 0; i < n - 1; i++) {
        // Create an empty hash set
        unordered_set<int> s;

        // Subtract current element from the target
        

        // Traverse the array to find a pair with sum equals to curr_sum
        for (int j = i + 1; j < n; j++) {
            int sum = X - a[i]-a[j];
            if (s.find(sum) != s.end()) {
                return true;
            }
            s.insert(a[j]);
        }
    }
    return false;
}

//2pointer 
/*
  bool find3Numbers(int a[], int n, int X)
    {
        //Your Code Here
        int l=0,r=0;
        
         // To find the other two elements, start two index
        // variables from two corners of the array and move
        // them toward each other
        sort(a,a+n);
        for(int i=0;i<n-2;i++){//why n-1 bcoz more 2 index var will go to end
            l=i+1 , r=n-1;
            
            while(l<r){
                if(a[i]+a[l]+a[r]==X){
                    return true;
                }else if(a[i]+a[l]+a[r]<X){
                    l++;
                }else
                    r--;
            }
        }
       return false;
    }

*/
};

//{ Driver Code Starts.

int main()
{
	int T;
	cin>>T;
	while(T--)
	{
		int n,X;
		cin>>n>>X;
		int i,A[n];
		for(i=0;i<n;i++)
			cin>>A[i];
		Solution ob;
        cout <<  ob.find3Numbers(A, n, X) << endl;
    }
}

// } Driver Code Ends