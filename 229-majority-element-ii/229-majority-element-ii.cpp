class Solution {
public:
  vector<int> majorityElement(vector<int> &a) 
  {
	  int y(-1), z(-1), cy(0), cz(0);
    
	  for (const auto & x: a) 
	  {
		  if (x == y) cy++;
		  else if (x == z) cz++;
		  else if (! cy) y = x, cy = 1;
		  else if (! cz) z = x, cz = 1;
		  else cy--, cz--;
     }
      
     cy = cz = 0;
     for (const auto & x: a)
		 if (x == y) cy++;
			 else if (x == z) cz++;
  
	  vector<int> r;
	  if (cy > size(a)/3) r.push_back(y);
	  if (cz > size(a)/3) r.push_back(z);
	  return r;
  }
};

/*
//1
class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
	
 The first approach is using unordered map you can also use use ordered map but it is not recommended because it consumes more time.
	
 // At max we can only have 2 majority elements	
	
         unordered_map<int , int> mp;
         int n = nums.size();
        
        for(int i = 0 ; i<n ; i++) {
            mp[nums[i]]++;    
        }
     
        vector<int> ans;
     
        for(auto itr = mp.begin() ; itr != mp.end() ; itr++) {
            if(itr->second > n/3) {
                ans.push_back(itr->first);
            }
        }
        
         return ans;
         }
         }
   //2
   
*/
