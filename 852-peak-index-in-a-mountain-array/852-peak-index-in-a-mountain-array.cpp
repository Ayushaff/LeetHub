class Solution {
public:
  
    int find_pivot(vector<int> v) {
		//If vector or array has no elements
        if(v.size() == 0){
            return -1;
        }
		
	int s = 0, e = v.size() - 1;
	int mid=(s + e) / 2;
	while (s < e)
	{
		//Comparing (mid) with (mid+1) 
		if(v[mid] < v[mid+1])
		
		// you are in ascending part of array
     			s=mid+1;
				
    		else
			// you are in decreasing part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
      			e = mid;
    
		mid = (s + e) / 2;
	}
//In the end start = end, so you can return either start or end 
	return s;
    }
    
    int peakIndexInMountainArray(vector<int>& arr) {
                return find_pivot(arr);

    }
};