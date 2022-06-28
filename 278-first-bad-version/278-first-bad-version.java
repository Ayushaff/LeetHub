/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl 
{
    public int firstBadVersion(int n)   
    {
        int lo=1,hi =n,fbv=-1;
        int mid=0;
        while(lo<=hi)
        {
            mid=lo +(hi-lo)/2;
            if(isBadVersion(mid)==true)
            {
                fbv=mid;
                hi=mid-1;
            }
            else
            {
                lo=mid+1;
            }
        }
        return fbv;
    }
}