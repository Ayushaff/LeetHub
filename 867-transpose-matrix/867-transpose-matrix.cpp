class Solution {
public:
    vector<vector<int>> transpose(vector<vector<int>>& matrix) 
    {
        
        int r = matrix.size();    
        int c= matrix[0].size(); //col
        
    if(r==c)
    {        
        for (int i = 0; i < r; i++)
        {
            for (int j = 0 ; j<=i;j++)
            {
                swap(matrix[i][j], matrix[j][i]);
            }
        }
        return matrix;
    }
        
        vector<vector<int>>v(c, vector<int>(r, 0));
        
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
              v[j][i]=matrix[i][j];     
    
    
        return v;
    }
};