class Solution {
    public int findDuplicate(int[] nums) {
        //4
        //o(n) o(1)
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        
        // again but fast goes as single step
        fast=nums[0];
       while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];  
       }
        return slow;
    }
}
  
        /*
         //3
        int res=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            a[a[i]%n]=a[a[i]%n]+n;
        }
        for(int i=0;i<n;i++){

            if(a[i]/n>1) res++;
        }
        return res;
    }    
}
*/
        /*  
      //2
            int len=nums.length;
        int []cnt=new int[len+1];
        for(int i=0;i<len;i++){
                cnt[nums[i]]++;            
         if(cnt[nums[i]]>1)return nums[i];
        }
        
    return len;
    }
}
*/
        /*
        //1 //time limit exce
        int len = nums.length;
        for(int i=0;i<len;i++){
        
            for(int j=i+1;j<len;j++){                
                if(nums[i]==nums[j]) return nums[i];
            }
        }
        return len;
    }
}
*/