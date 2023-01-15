class Solution {
    int a=0,b=0;
    public int ele(int i){
        a+=i;
        System.out.println("A="+a);
        return a;
    }
    public int dig(int i){
       while(i>0){
           b+=i%10;
           i/=10;
       }
        return b;
    }
    public int differenceOfSum(int[] nums) {
        int aa=0,bb=0;
        int aab=0;
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
             aa=ele(nums[i]);
             bb=dig(nums[i]);
        }
            aab=bb-aa;
            System.out.println(aab);
            ans=Math.abs(aab);
        
        return ans;
    }
}