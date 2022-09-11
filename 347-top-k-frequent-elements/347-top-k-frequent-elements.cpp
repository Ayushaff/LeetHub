class Solution {
public:
                /*
        1 aproach o(nlonn) sorting and using extra space for vector
        
        2 efficient is heap as min or max both can be used but 
            [ max not efficient nlogn times ]
            the difference is in max heap there will n elements and logn of operations done TC O(Nlogn) SC O(N) N elements will be there in max heap
            [min is nlogk times ]
            and in min heap there will be k elements only and logk of operation being done TC O(klogk) SC O(k) k elements will be there in min heap
            */
            
      // a map and a min heap
        
    vector<int> topKFrequent(vector<int>& nums, int k) {
            unordered_map<int,int>counts;
            priority_queue<pair<int,int>, vector<pair<int,int>>,greater<pair<int,int>>>min_heap;
            
        for(auto i:nums)
                counts[i]++;
            
            for(auto & i:counts){
                    min_heap.push({i.second,i.first});
                    
                    if(min_heap.size()>k)
                        min_heap.pop();
            }
            vector<int>ans;
            while(k--){
                    ans.push_back(min_heap.top().second); //elements pushed in ans vector
                    min_heap.pop();
            }
            return ans;
    }
};