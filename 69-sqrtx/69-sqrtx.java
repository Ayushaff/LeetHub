class Solution {
    long myBS(int n){
        long s=0, e=n;
        long ans=-1;
        
        long mid =(s+(e-s)/2);
        while(s<=e)
        {
            long sqr =(mid*mid);
            if(sqr==n) return mid;
            
            if(sqr<n)
            { 
                ans=mid;//this can be possible soln because its less than n 
                s=mid+1;
            }
            else 
            {
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return ans;        
    }
    public int mySqrt(int x) {
        return (int)myBS(x);
    }
}