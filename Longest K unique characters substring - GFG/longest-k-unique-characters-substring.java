//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

/*
Approach:
1.	Keep on building the substring from j=0 [increasing the window size] and log occurance of each character in a Map.
2.	If map size (Unique Characters in Map) becomes greater than k, keep on reducing window size (increase i pointer) and decrease the occurance of character from 
Map till map size becomes <=k. 
3.	If map size becomes equal to k, compute the Candidate answer.
4.	Increase j pointer and perform steps 1-3 until j<array size [while loop condition] .
*/
class Solution {
    public int longestkSubstr(String s, int k) 
    
    {
        // code here
        int n=s.length();
        int mx=-1;
        int i=0,j=0;
        
        Map<Character,Integer>mp=new HashMap<>();
        
        while(j<n)
        {
        //Sliding window Calculations    
        char ch=s.charAt(j);
          //get the frequency of ch from Map and then increase it by 1 in the map.
        mp.put(ch,mp.getOrDefault(ch,0)+1);//increase the frequency of current character in Map*/
        
          //Sliding Window Condition: hashmap.size = k  [OR number of Unique Characters =k];
          if(mp.size()>k)
          {
               /*Reduce the frequency of ith element by 1 and remove it from map if frequency becomes 0.
                                                 Keep doing above [reducing window size] till hm.size becomes <=k  */
                while(mp.size()>k)
                {
                    mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                    
                    if(mp.get(s.charAt(i))==0)
                    {
                        mp.remove(s.charAt(i));
                    }  
                    i++;
                }
          }
              if(mp.size()==k)//unique chars = k , compute candidate answer.
              {
                  int tempans=j-i+1;
                  mx=Math.max(mx,tempans);
              }
          j++;// increase window size and look for next window where sum = target
        }
        return mx;
    }
}