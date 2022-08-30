class Solution {
    public void rotate(int[][] matrix) {
            
        //transpose 
        int ro = matrix.length;
        

        for (int i = 0; i < ro; i++) { // loop for row
            for (int j = i; j < ro; j++) // loop for col
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse
        for (int i = 0; i < ro; i++) { 
            for (int j = 0; j < ro/2; j++){
                int temp =matrix[i][j];
                matrix[i][j]=matrix[i][ro-j-1];
                matrix[i][ro-j-1]=temp;
            }
        }
        
    }
}