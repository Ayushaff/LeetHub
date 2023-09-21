class Solution {
public:
    //3optimial merge sort
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
    int i=m-1,j=n-1,k=m+n-1; //so k gone at last k will hold the last index nums2 and p3 will keep track of index where we will place the element.
    while(i>=0&&j>=0){
        if(nums1[i]>nums2[j]){
            nums1[k]=nums1[i];
            i--,k--;
        }else{
            nums1[k]=nums2[j];
            j--,k--;
        }
    }
        while(j>=0){
            nums1[k]=nums2[j];
            j--,k--;
        }
     
    
    }

    // //1
    // void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
    //     for( int i=m, j=0; i<nums1.size(); i++,j++)
    //     {
    //         nums1[i] = nums2[j];
    //     }
    //     sort(nums1.begin(), nums1.end());
    
    //2
   /* void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i = m - 1, j = n - 1, tar = m + n - 1;
        while (j >= 0) {
            nums1[tar--] = i >= 0 && nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
    }*/
};
