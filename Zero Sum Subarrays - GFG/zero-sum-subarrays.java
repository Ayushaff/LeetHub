//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    long arr[]=new long[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.findSubarray(arr,n));
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] nums ,int n) 
    {
        //Your code here
        int k=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
            mp.put(0,1);
            int sum=0,ans=0;  
            
            for(int i=0;i<nums.length;i++){
                    sum+=nums[i];
                    if(mp.containsKey(sum-k)){
                            ans+=mp.get(sum-k);     
                            //System.out.println("a");                       
                    }
                mp.put(sum,mp.getOrDefault(sum,0)+1);
              // System.out.println(i+" "+mp.get(sum-k));
            }
             /*for(Map.Entry<Integer,Integer>e:mp.entrySet())
                    System.out.println( e.getKey() +" "+e.getValue());*/
            return ans;
    }
}