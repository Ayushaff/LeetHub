class Solution {
    public int[][] transpose(int[][] matrix) {
        int n=matrix.length ,m=matrix[0].length;
        
        int [][]ans =new int[m][n]; //column of matrix will become rows of ans so we need, length of ans's rows same as columns of matrix rows of matrix will become column of ans so need, length of column same as rows of matrix Time Complexity: O(R * C)O(R∗C), where RR and CC are the number of rows and columns in the given matrix A.Space Complexity: O(R * C)O(R∗C), the space used by the answer.
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[j][i]=matrix[i][j];
            }            
        }
        return ans;
    }
}