class Solution
{
    public:
    bool checkPossibility(vector<int>& nums)
    {
        bool modi=0;     //modification bwahahoifhahhaha
        for(int i=1;i<nums.size();i++)
        {
            if(nums[i]<nums[i-1])
            {     
                if(modi==1){
                    return false;    //nums[i]=nums[i-1];
                }
                if(i<2||nums[i-2]<=nums[i])
                {
                nums[i-1]=nums[i];
                }
                else
                {
                nums[i]=nums[i-1];
                }
                modi=1;
            }
        }
        return true;
    }
};
/*class Solution {
public:
    bool checkPossibility(vector<int>& nums) {
    int modify=0;
        for(int i=1;i<nums.size();i++){
            if(modi==1)return false;
            if(nums[i-1]>nums[i]){
                nums[i-1]=nums[i];
            }
            if(i<2||nums[i-2]>=nums[i]){
                nums[i]=nums[i-1];
            }
            else{
                nums[i-1]=nums[i];
                
            }
            modify=1;
        }
        return true;
    }
};*/