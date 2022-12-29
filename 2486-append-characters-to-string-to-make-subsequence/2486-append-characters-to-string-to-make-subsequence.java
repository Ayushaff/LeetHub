class Solution {
    public int appendCharacters(String s, String t) {
        int s1=s.length();
        int t2=t.length();
        int i=0,j=0;
        while(i<s1 && j<t2)
        {
            if(s.charAt(i)==t.charAt(j))
                {
                    j++;
                }
            i++;
        }
        return t2-j;
    }
}