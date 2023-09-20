class Solution {
public:
    int minOperations(vector<int>& nums, int x) {
         int sum=0,n=nums.size();

        //find total sum
        for(int i=0;i<n;i++)sum+=nums[i];

        int tar=sum-x;
        int currsum=0,maxlen=0;

        int i=0;//start index
        bool found=false;

        for(int j=0;j<n;j++){
            currsum+=nums[j];
            while(i<=j&&currsum>tar){
                currsum-=nums[i];//shrink
                i+=1;
            }
            if(currsum==tar){
                found=true;
                maxlen=max(maxlen,j-i+1);
            }
            
        }
        return found?n-maxlen:-1;
    }
};