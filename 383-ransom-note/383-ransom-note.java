class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int []arr=new int[26];
        for(char mg : magazine.toCharArray()){
            arr[mg-'a']++;
        }
        
        for(char ch:ransomNote.toCharArray()){
            if(arr[ch-'a']==0) return false;
            else arr[ch-'a']--;
        }
        return true;
    }
}