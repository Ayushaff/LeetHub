class Solution 
{
    
    public int majorityElement(int[] nums) {
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
}
        
        
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