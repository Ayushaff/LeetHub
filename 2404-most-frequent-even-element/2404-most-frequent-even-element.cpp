class Solution {
public:
        //https://www.youtube.com/watch?v=fyuHcXG9iQI
      
    int mostFrequentEven(vector<int>& nums) {
            map<int,int>counts;
            
            for(int i:nums){
                if(i%2==0)
                   counts[i]++;    
            }
            
            int ans=-1 ,freq=INT_MIN; 
            
            for(auto i: counts){
                //cout<<i.first <<" "<<i.second<<endl;
                    if(i.second>freq){
                            ans=i.first, freq=i.second;
                    }
            }
            return ans;
    }
};
 /*     int ans;
            unordered_map<int,int>counts;
            priority_queue<pair<int,int>, vector<pair<int,int>>,greater<pair<int,int>>>min_heap;
            
            for(auto i:nums){
                if(nums[i]%2==0)
                   counts[i]++;    
            }
            for(auto &i: counts){
                    
                min_heap.push({i.first,i.second});
                    int j=i+1;
                    
                    if(min_heap.get(i.first)>min_heap.get(j.first) || min_heap.get(i.second)<min_heap.get(j.second)){
                            min_heap.pop();
                    }
                    ans=i.first;
            }
                
            return ans;            
    }
};*/