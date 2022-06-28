/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl 
{
    public int firstBadVersion(int n)   
    {
     long lo=1;
     long hi=n;
     long mid;
     long result =n;
     while(lo<=hi)
        {  
        mid=(lo+hi)/2;
        if(isBadVersion((int)mid)==true) 
        {
            result=mid;
            hi=mid-1;
        }
        else lo=mid+1;
        
        }
    return (int)result;
     }
}
       
       /*int lo=1,hi =n,fbv=-1;
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
}*/