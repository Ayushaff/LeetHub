class Solution {
    public int[] findErrorNums(int[] nums) {
        //1 O(n^2)
            //[1,2,2,4]
            int dup=-1,missing=-1;
            
            for(int i=1;i<=nums.length;i++){
                int count=0;
                    for(int j=0;j<nums.length;j++){
                            if(nums[j]==i){
                                    //System.out.println("a: "+nums[j]+" "+i);
                                    count++;
                            }
                    }
                    if(count==2)
                            dup=i;
                    else if(count==0)
                            missing=i;
            }
            return new int[]{dup,missing};
    }
}