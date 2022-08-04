class Solution {
    public int mirrorReflection(int p, int q) {
       // https://leetcode.com/problems/mirror-reflection/discuss/146336/Java-solution-with-an-easy-to-understand-explanation
        while(p%2==0 && q%2==0){
            p/=2;
            q/=2;
        }
        if(q%2==0 && p%2!=0) return 0;
        
        if(q%2!=0 && p%2==0) return 2;
        
        if(q%2!=0 && p%2!=0) return 1;
        
        return -1;
    }    
}