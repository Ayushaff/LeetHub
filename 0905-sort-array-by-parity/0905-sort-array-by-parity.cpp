class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nn) {
        int i=0,j=0,n=nn.size();
        for(i=0;i<n;i++){
            if(nn[i]%2==0){
            swap(nn[i],nn[j]);
            j++;
            }
        }
        return nn;
    }
};