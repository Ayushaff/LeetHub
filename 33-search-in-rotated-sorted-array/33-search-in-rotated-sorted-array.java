class Solution {
    public int search(int[] nums, int target) {
        int low=0;
		int high=nums.length-1;
        
			while(low<=high) {
                
			int mid=low+(high-low)/2;
                 
				if (nums[mid]==target) 
					return mid;
                
                if (nums[low]<=nums[mid])
                {
                //left side is sorted 
                        //if element lies on left half or not
                 if(target>=nums[low] && target<=nums[mid] )
                        high=mid-1; //elemenate right half 
                    
                    else
                        low=mid+1; //else eleminate left half
                }
                
                else  {
                    //right side is sorted if left is not sorted 
                        if(target>= nums[mid] && target<= nums[high])
                                low=mid+1;      //elemenate left half 
                        else
                                high=mid-1;      //else eleminate right half
                 }
            }
        return -1;      
    }
}