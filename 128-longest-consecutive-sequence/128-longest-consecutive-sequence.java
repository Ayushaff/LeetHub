class Solution {
    public int longestConsecutive(int[] nums) {
     Set<Integer>hashset=new HashSet<Integer>();
        for(int num:nums){
            hashset.add(num);
        }
        int streak=0; //counting all consecutive sequences of the nums array
        for(int num:nums)
        {
            if(!hashset.contains(num-1))
            {
                int currentNum=num;
                int currentStreak=1;
                while(hashset.contains(currentNum+1))
                {
                    currentNum+=1;
                    currentStreak+=1;
                }
                streak=Math.max(currentStreak,streak);
            }
        }
            return streak;
    }
}