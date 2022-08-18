class Solution {
    public int lastStoneWeight(int[] stones) {
        /*Time Complexity :- BigO(NlogN)
         Space Complexity :- BigO(N)*/
         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int s : stones)
            pq.offer(s);
        
        while(pq.size() > 1){
            int x= pq.poll();
            int y=pq.poll();
            if(x!=y) pq.offer(x-y);
           
        }
        if(pq.size() == 1)return pq.poll();
            else return 0;
    }
}