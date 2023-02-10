class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n=grid.length;
            int m=grid[0].length;
            
            for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++){
                            //diagonals conditions
                           if(i==j ||i+j==n-1) //if [0][0] , [1][1], and when 0+3=3(n-1 ) ,1+2=3 ,2+1=3,3+0=3
                           {
                                   if(grid[i][j]==0)
                                           return false;
                           }                            
                            else{//non diagonal
                               if(grid[i][j]!=0)     
                                       return false;
                            }
                    }
            }
            return true;
    }
}