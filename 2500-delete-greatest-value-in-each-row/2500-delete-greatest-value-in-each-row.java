class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int res=0;
        //O(nlogn) O1
        
        for(int i=0;i<r;i++)
            Arrays.sort(grid[i]);   //rows got sorted 
        
        for(int j=0;j<c;j++){   
            int mx=Integer.MIN_VALUE;
            for(int i=0;i<r;i++){   //traverse each rows
                mx=Math.max(mx,grid[i][j]); //will get max  value from each rows
            }
            res+=mx;    
        }
        return res;
    }
}