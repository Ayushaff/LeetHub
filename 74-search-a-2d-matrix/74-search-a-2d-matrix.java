class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //binary search
        if(matrix.length==0)return false;
        int row=matrix.length;
        int col=matrix[0].length;
        
        int s=0;
        int e=(row*col)-1;
        
        int mid=(s+(e-s)/2);
        
        while(s<=e){
            int element=matrix[mid/col][mid%col];
            
            if(element==target){
                return true;
            }
            if(element<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return false;
    }
}