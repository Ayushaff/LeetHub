class Solution {
public:
    int lastStoneWeight(vector<int>& stones) {
        //default max heap 
        int stonessz=stones.size();
        priority_queue<int>pq;
        
        for(int i=0;i<stonessz;i++)
            pq.push(stones[i]);
        
        while(pq.size() > 1)
        {
            int x=pq.top(); pq.pop();
            int y=pq.top(); pq.pop();
            if(x>y)
                pq.push(x-y);
        }
        
        if(pq.size() == 1) return pq.top();
        else return 0;
    }
};