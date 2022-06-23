class Solution {
   //2
/*public int findKthLargest(int[] nums, int k) {
    if(nums.length==1)return 1;
    
     PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length;i++)
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
public int findKthLargest(int[] nums, int k) {
      final int N = nums.length;
        Arrays.sort(nums);
        return nums[N - k];
}
};