class Solution {
public:         
    //https://leetcode.com/problems/climbing-stairs/discuss/1504255/C%2B%2B-Simple-and-Easy-Fibonacci-Solution-With-Explanation

    int climbStairs(int n) {
        if (n <= 2) return n;
        int prev = 2, prev2 = 1, res;
        for (int i = 3; i <= n; i++) {
            res = prev + prev2;
            prev2 = prev;
            prev = res;
        }
        return res;
    }
};
    
    /*
    int a = 1, b = 1;
    while (n--)
        a = (b += a) - a;
    return a;
}
        
     vector<int> steps(n,0);
     steps[0]=1;
     steps[1]=2;
     for(int i=2;i<n;i++)
     {
         steps[i]=steps[i-2]+steps[i-1];
     }
     return steps[n-1];
};
*/