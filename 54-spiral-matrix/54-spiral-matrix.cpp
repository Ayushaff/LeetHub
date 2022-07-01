class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>> &matrix)
    {
        // 2
        vector<int> ans;
        int row = matrix.size();
        int col = matrix[0].size();

        int count = 0;
        int totl = row * col;

        // index initialize
        int startingRow = 0;
        int startingCol = 0;
        int endingRow = row - 1;
        int endingCol = col - 1;

        while (count < totl)
        {
            // print startingRow
            // startingcol se ending col tak loop

            for (int index = startingCol; count < totl && index <= endingCol; index++)
            {
                ans.push_back(matrix[startingRow][index]);
                count++;
            }
            startingRow++;

            // print endingCol
            // startingRow se ending row tak loop
            for (int index = startingRow; count < totl && index <= endingRow; index++)
            {
                ans.push_back(matrix[index][endingCol]);
                count++;
            }
            endingCol--;

            // print endingRow
            // endingCol se startingcol tak loop
            for (int index = endingCol; count < totl && index >= startingCol; index--)
            {
                ans.push_back(matrix[endingRow][index]);
                count++;
            }
            endingRow--;

            // print staringCol
            // endingRow se startingRow tak loop
            for (int index = endingRow; count < totl && index >= startingRow; index--)
            {
                ans.push_back(matrix[index][startingCol]);
                count++;
            }
            startingCol++;
        }
        return ans;
    }
        
        /* 1
        vector<int>ans;
        int N=matrix.size();
        int M=matrix[0].size();
        int top=0;
        int down=N-1;
        int left=0;
        int right=M-1;
        int dir=0;
        while(left<=right && top<=down)
        {
            if(dir==0)
            {
                for(int i=left;i<=right;i++)
                {
                    ans.push_back(matrix[top][i]);
                }
                top++;
            }
            else if(dir==1)
            {
                for(int i=top;i<=down;i++)
                {
                    ans.push_back(matrix[i][right]);
                }
                right--;
            }
            else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                {
                    ans.push_back(matrix[down][i]);
                }
                down--;
            }
            else if(dir==3)
            {
                for(int i=down;i>=top;i--)
                {
                    ans.push_back(matrix[i][left]);
                }
                left++;
            }
            dir=(dir+1)%4;
        }
        return ans;*/
        
};