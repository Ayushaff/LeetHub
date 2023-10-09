//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.rearrange(S, N);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public String rearrange(String S, int N){
        int []vowels=new int[26];
        int []cons=new int[26];
        
        int noofVowels=0;
        int noofcons=0;
        
        char smallestVowel='u';
        char smallestCons='z';
        
        for(char c:S.toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowels[c-'a']++;
                noofVowels++;
                smallestVowel=(char) Math.min((int)smallestVowel,(int)c);
            }else{
                cons[c-'a']++;
                noofcons++;
                smallestCons=(char) Math.min((int)smallestCons,(int)c);
            }
            
        }
        if(Math.abs(noofVowels-noofcons)>1)return "-1";
        boolean isVowel=false;
        
        if(noofVowels>noofcons){
        isVowel=true;
        }
        else if(noofcons>noofVowels){
        isVowel=false;
        }
        
        else {
            if(smallestVowel<smallestCons)
            isVowel=true;
            else
            isVowel=false;
        }
        StringBuilder s=new StringBuilder();
        int i=0,j=0;
        while(i<26&&j<26){
            if(isVowel){
                while(i<26&&vowels[i]==0)i++;
                if(i==26)break;
                s.append((char)('a'+i));
                vowels[i]--;
                isVowel=false;
            }else{
                while(j<26&&cons[j]==0)j++;
                if(j==26)break;
                s.append((char)('a'+j));
                cons[j]--;
                isVowel=true;
            }
        }
        
        
        return s.toString();
    }
}