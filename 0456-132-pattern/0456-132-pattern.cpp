class Solution {
public:
    bool find132pattern(vector<int>& nums) {
        stack<int> s;
        int max3 = INT_MIN;
        for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums[i] < max3)
                return true;
            while (!s.empty() && s.top() < nums[i]) {
                max3 = s.top();
                s.pop();
            }
            s.push(nums[i]);
        }
        return false;
    }
};
    
 //1 
// int n=nums.size();
    
//     int min_initial=nums[0];
//     for(int j=0;j<nums.size();j++){
//         for(int k=j+1;k<nums.size();k++){
//                 if(nums[k]>min_initial && nums[j]>nums[k] )
//                     return true;
            
//             min_initial=min(nums[j],min_initial);
//                 }
//             }
//         return false;
//     }
//};

// Time complexity of this code is O(n^2) since two for loo[s are used since we will be traversing in the two loops
// Lets figure out optimised approach to solve the it in O(n) time .