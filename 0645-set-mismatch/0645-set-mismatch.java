
class Solution {
        
    public int[] findErrorNums(int []nums) {
          Map<Integer,Integer>mp=new HashMap<>(); 
          int dup=-1,miss=-1;
          
           for(int n:nums){
                   mp.put(n,mp.getOrDefault(n,0)+1);
           }
            
            for(int i=1;i<=nums.length;i++){
                    if(mp.containsKey(i)){
                            if(mp.get(i)==2)
                                    dup=i;
                    }
                    else 
                            miss=i;
            }
            return new int[]{dup,miss};
    }
}
   /*   //1 O(n^2)
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
}*/

/*
Approach 4: Using Map
Algorithm

The given problem can also be solved easily if we can somehow keep a track of the number of times each element of the numsnums array occurs. One way to do so is to make an entry for each element of numsnums in a HashMap mapmap. This mapmap stores the entries in the form (num_i, count_i)(num 
i
​
 ,count 
i
​
 ). Here, numnum refers to the i^{th}i 
th
  element in numsnums and count_icount 
i
​
  refers to the number of times this element occurs in numsnums. Whenever, the same element occurs again, we can increment the count corresponding to the same.

After this, we can consider every number from 11 to nn, and check for its presence in mapmap. If it isn't present, we can update the missingmissing variable appropriately. But, if the countcount corresponding to the current number is 22, we can update the dupdup variable with the current number.
*/