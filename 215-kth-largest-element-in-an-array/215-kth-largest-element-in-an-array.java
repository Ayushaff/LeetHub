class Solution {
    //4
    
    //3
    
    public int findKthLargest(int[] nums, int k) {
//min_heap  
    /* PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:nums){
            pq.add(i);  
            if(pq.size()>k)pq.poll();
        }
        return pq.peek();
    }*/
        Arrays.sort(nums);
        return nums[(nums.length)-k];
}    
}
   //2
/*public int findKthLargest(int[] nums, int k) {
//min_heap    
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++)
            pq.add(i);
        for (int i = k; i < nums.length; i++) {
            if (pq.peek() < nums[i]) {
                pq.poll();
                pq.add(nums[i]);
            }
        }

        return pq.peek();
    }
}*/

//1
/*public int findKthLargest(int[] nums, int k) {
      final int N = nums.length;
        Arrays.sort(nums);
        return nums[N - k];
}
} */