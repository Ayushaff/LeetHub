class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer>list=new ArrayList<>();    
            for(int i:nums){
                    List<Integer>temp=new ArrayList<>();
                    while(i>0){
                            temp.add(i%10);
                            i/=10;
                    }
        
        Collections.reverse(temp);
        list.addAll(temp);    
            }
                int []ans=new int[list.size()];
            for(int i=0;i<list.size();i++){
                    ans[i]=list.get(i);
            }
            return ans;
    }
}