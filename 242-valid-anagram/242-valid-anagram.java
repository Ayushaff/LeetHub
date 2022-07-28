class Solution {
    public boolean isAnagram(String s, String t) {
        //watch out both anagrams words are same of size
        if(s.length()!=t.length())return false;
        
        char []sChar=s.toCharArray();
        char []tChar=t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return new String(sChar).equals(new String(tChar));
    
    }
} 