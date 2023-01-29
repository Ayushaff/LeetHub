//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    private void find(int ind,ArrayList<Integer>arr,int n,ArrayList<Integer>ans,int sum){
        if(ind==n){
            ans.add(sum);
            return;
        }
        //pick
        find(ind+1,arr,n,ans,sum+arr.get(ind));
        //not pick
        find(ind+1,arr,n,ans,sum);
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n){
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int s=0;
        find(0,arr,n,ans,s);
        Collections.sort(ans);
        return ans;
    }
}