class Solution {
    public int[] applyOperations(int[] nums) {
        //tc sc O(n) O(1)
        int n = nums.length;
        
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        
        int i=0,j=0;
        while(i<n){
            if(nums[i]!=0)
                nums[j++]=nums[i];
            i++;
        }
        while(j<n)
            nums[j++]=0;
        return nums;
    }
}
//2
//tc sc O(n) O(n)
/*

  int n = nums.length;
        
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        
    int []ans=new int[n]; int j=0;
     for (int i = 0; i < n - 1; i++) {
            if(nums[i]!=0)
                nums[j++]=nums[i];
        }
        return ans;
*/

//1

/*
             for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == nums[i + 1]){
             nums[i] *= 2;
             nums[i + 1] = 0;
         }
        }
        
        move(nums);
        return nums;
    }
    public int[] move(int arr[]){
        int j=0;
        for(int i=0;arr.length;i++){
            if(arr[i]!=0){
                arr[j++]=arr[i];
            }
        }
        return arr;
    }
}*/