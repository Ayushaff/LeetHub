class Solution 
{
    
    public int majorityElement(int[] nums) {
        //4
        int c=0,ele=0;
            for(int num:nums){
                if(c==0)
                        ele=num;
                    if(ele==num)
                            c+=1;
                    else 
                            c-=1;
                    
            }            
            return ele;
    }
}
        //3 sorting TC O(Nlogn) SC O(1) *We sorted nums in place here - if that is not allowed, then we must spend linear additional space on a copy of nums and sort the copy instead.*
        /*Arrays.sort(nums);
        return nums[nums.length/2];
    }
}*/
        
           //hashmap TC O(N) SC (N) we want soln of SC O(1) so more approaches are sorting and Boyer-Moore Voting Algorithm
        //2)
        
      /*
      1)
      //O(N^2)

        int majorityCount = nums.length/ 2;
        for (int num : nums)
        {
            int count = 0;
            for (int elem : nums)
            {
                if (elem == num)
                    count += 1;
            }
            if (count > majorityCount)
                return num;
        }
        return -1;
    }
}*/
        
        
        //O(N^2)
       /*
       int max = 0;
        int ans=0;

        for (int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        int nn=arr.length/2;
        int freq[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            System.out.println(i+"->"+freq[i]);
             
             if(freq[i]>nn){
                System.out.println(i);
                 ans=i;
                 return ans;
            }
        }    
        return ans;
    }
}*/