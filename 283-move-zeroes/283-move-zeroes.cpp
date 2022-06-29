class Solution {
public:
    void moveZeroes(vector<int>& nums) {
     //3
        int nonZero=0;
        
        for(int i=0;i<nums.size();i++){
            if(nums[i]!=0){
            swap(nums[i],nums[nonZero]);
            nonZero++;
        }
        }
    }
};
    /*
    //1
        for(int i=0;i<nums.size();i++){
            if(nums[i]==0){
                nums[nums.size-1]==nums[i];
                
            }
        }
        
    //2

    int zeros=0;
        vector<int>a;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==0)zeros++;
            else a.push_back(nums[i]);
        }
        for(int i=0;i<zeros;i++) a.push_back(0);
        for(int i=0;i<nums.size();i++)nums[i]=a[i];
    }
    */
  