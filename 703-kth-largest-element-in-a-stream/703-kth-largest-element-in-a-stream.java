class KthLargest {
    
PriorityQueue<Integer>pq=new PriorityQueue<>();
int globalK=0;
    
    //TM (NlogK)
    public KthLargest(int k, int[] nums) {
        
        globalK=k;        
        for(int i:nums)
        {
            add(i);
//             if(pq.size()<k){                               
                 
//                 pq.add(i);
//             }
            
//             if(pq.size()==k && i>=pq.peek())
//             {
//                 //conditions 1 if pq.size > k it wont add && 2 insert in pq only if value is greater than of pq.peek()
//                 pq.add(i);
                
//             }            
            
//             if(pq.size()>k)
//                 pq.poll();
      }    
    }
        
    
    public int add(int val) {
        
     if(pq.size()<globalK)
                pq.add(val);
        
        else if(pq.size()==globalK && val>=pq.peek())
            pq.add(val);

        if(pq.size()>globalK)
            pq.poll();
        
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */