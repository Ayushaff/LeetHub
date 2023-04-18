//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public Vector<Integer>subsetSum(int arr[],int s,int n){
        boolean t[][]=new boolean[n+1][s+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<s+1;j++){
                if(i==0)
                t[i][j]=false;
                if(j==0)
                t[i][j]=true;
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<s+1;j++){
                if(arr[i-1]<=j){
                    t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j];
                }
                else
                    t[i][j]=t[i-1][j];
            }
        }
        Vector<Integer>v=new Vector<>();
        for(int j=0;j<=s/2;j++){
            if(t[n][j]==true)
                v.add(j);
        }
        return v;
    }
	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    Vector<Integer>v=new Vector<>();
	    int s=0;
	    int mn=Integer.MAX_VALUE;
	    for(int i=0;i<n;i++){
	        s+=arr[i];
	    }
	    v=subsetSum(arr,s,n);
	    for(int i:v){
	        mn=Math.min(mn,s-(2*i));
	    }
	    return mn;
	} 
}
