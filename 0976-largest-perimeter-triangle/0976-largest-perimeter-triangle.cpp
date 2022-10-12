class Solution {
public:
    int largestPerimeter(vector<int>& nums) {
        sort(nums.begin(),nums.end());
            
            //in the end there are better maxi values just check them to make perimetre of triangles
            //to make largest perimetre triangle we need 3 sides
            for(int i=nums.size()-1;i>1;i--){
                   
                    
            int l1=nums[i-2] ,l2=nums[i-1] ,l3 =nums[i];
            
            if(l3<l1+l2)
                    return l1+l2+l3;
            }
            return 0;
    }
};