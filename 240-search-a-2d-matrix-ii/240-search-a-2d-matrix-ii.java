class Solution {
    public boolean searchMatrix(int[][] matrix, int t) {
        int row=matrix.length;
        int col=matrix[0].length;
        int i=0,j=col-1;
        while(i>=0 && i<row && j>=0 && j<col){
            if(matrix[i][j]==t){
                return true;
            }
            else if(matrix[i][j]>t){
                j--;
            }else if(matrix[i][j]<t){
                i++;
            }
        }
        return false;
    }
}

/*class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {


        for(int i=0;i<matrix.length;i++)
        {
            
            for(int j=0;j<matrix.length;j++)
            {
                
                if(matrix[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}*/