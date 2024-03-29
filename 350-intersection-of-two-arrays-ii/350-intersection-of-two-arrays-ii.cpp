class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        //no need of unique intersections 
        
        int i,j;
        int n=nums1.size();
        int m=nums2.size();
        
        sort(nums1.begin(),nums1.end());        sort(nums2.begin(),nums2.end());
        i=0,j=0;
        vector<int>ans;
        
        while(i<n && j<m){
            if(nums1[i]<nums2[j]) i++ ;
            else if(nums1[i]>nums2[j]) j++;
            else{
                ans.push_back(nums1[i]);
                i++;
                j++;
            }
        }        
        return ans;
    }
};