class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        unordered_map<int,int>map;
        stack<int>st;
        int n=nums2.size();
            
            for(int i=n-1;i>=0;i--){
                    int ele=nums2[i];
                    
                    while(!st.empty() && st.top()<=ele){        //if top is smaller than current element 
                            st.pop();
                    }
                    int res=(st.empty())? -1 : st.top();        //if empty then no more top has greater element else top is greater
                    st.push(ele);
                    
                map.insert({ele,res});
                
            }
            vector<int>ans;
            for(auto x:nums1){
                    ans.push_back(map[x]);
            }
            return ans;
    }
};