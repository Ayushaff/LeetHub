class Solution {
    public int minStoneSum(int[] p, int k) {
        //to get floor value n-(n/2)
        //5/2 = is floor value 2 
        //Is Java Priority queue max or min? Answer: By default, the priority queue in Java is min Priority queue with natural ordering. To make it max, we have to use a custom comparator so that head of the queue returns the greatest element in the queue
        PriorityQueue<Integer>pq=new PriorityQueue<>((a, b)->b - a);
        for(int i:p){
            pq.add(i);
        }
        while(k-- >0){
            int x=pq.peek();
            pq.poll();
            pq.add(x-(int)(Math.floor(x/2)));
            //pq.add(x-(x/2));
        }
        int sum=0;
        while(!pq.isEmpty())
        { 
            sum+=pq.peek();
            pq.poll(); 
        }
        return sum;
}
}
