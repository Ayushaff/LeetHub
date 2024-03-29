class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        //need only unique intersections
        int i,j;
        int n=nums1.size();
        int m=nums2.size();
        
        sort(nums1.begin(),nums1.end());        sort(nums2.begin(),nums2.end());
        
        set<int>s;
        i=0; j=0;
        
        while(i<n && j<m){
            if(nums1[i]>nums2[j]) j++;
            else if(nums1[i]<nums2[j]) i++;
            else if(nums1[i] == nums2[j]) {
                s.insert(nums1[i]);
                i++; j++;
            }
        }
        vector<int> ans;
        for(auto i :s) ans.push_back(i);
        return ans;
    }
};
/*This is a Facebook interview question.
They ask for the intersection, which has a trivial solution using a hash or a set.

Then they ask you to solve it under these constraints:
O(n) time and O(1) space (the resulting array of intersections is not taken into consideration).
You are told the lists are sorted.

Cases to take into consideration include:
duplicates, negative values, single value lists, 0's, and empty list arguments.
Other considerations might include
sparse arrays.

function intersections(l1, l2) {
    l1.sort((a, b) => a - b) // assume sorted
    l2.sort((a, b) => a - b) // assume sorted
    const intersections = []
    let l = 0, r = 0;
    while ((l2[l] && l1[r]) !== undefined) {
       const left = l1[r], right = l2[l];
        if (right === left) {
            intersections.push(right)
            while (left === l1[r]) r++;
            while (right === l2[l]) l++;
            continue;
        }
        if (right > left) while (left === l1[r]) r++;
         else while (right === l2[l]) l++;
        
    }
    return intersections;
}*/