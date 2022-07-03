class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int r=matrix.length; //row
        int c=matrix[0].length; //col
        
        int [][]res=new int[c][r]; //col * row -> dimension of result
        
        for(int i=0;i<r;i++){     //loop for row       
            for(int j=0;j<c;j++)    //loop for col
            res[j][i]=matrix[i][j];     
        }
        return res;
    }
}