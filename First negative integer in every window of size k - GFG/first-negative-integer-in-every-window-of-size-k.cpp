//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

vector<long long> printFirstNegativeInteger(long long int arr[],
                                             long long int n, long long int k);

// Driver program to test above functions
int main() {
    long long int t, i;
    cin >> t;
    while (t--) {
        long long int n;
        cin >> n;
        long long int arr[n];
        for (i = 0; i < n; i++) {
            cin >> arr[i];
        }
        long long int k;
        cin >> k;

        vector<long long> ans = printFirstNegativeInteger(arr, n, k);
        for (auto it : ans) cout << it << " ";
        cout << endl;
    }
    return 0;
}

// } Driver Code Ends


vector<long long> printFirstNegativeInteger(long long int arr[],
                                             long long int n, long long int k) {
                vector<long long>ans;
                deque<long long>list;
                long i=0,j=0;
                
                while(j<n){
                    int winsz=j-i+1;
                    
                    if(arr[j]<0)
                        list.push_back(arr[j]);
                        
                    if(winsz<k)
                        j++;
                    else if(winsz==k){
                        if(!list.empty())
                            ans.push_back(list.front());
                            
                            else
                                ans.push_back(0);
                                
                                if(arr[i]<0)
                                    list.pop_front();
                                    i++;j++;
                    }
                }
                return ans;
 } 