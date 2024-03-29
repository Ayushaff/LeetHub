class Solution {
    public void reverse(char[] str, int i, int j) {
        for (; i < j; i++, j--) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
    }
    public String reverseWords(String s) {
/* if (s == null || s.length() == 0)
            return s;*/
        char[] str = s.toCharArray();
        int i = 0;
        int j = 0;
        while (j <= str.length) {
            if (j == str.length || str[j] == ' ') {
                reverse(str, i, j - 1);// j-1 because j is at space character
                i = j + 1;// i is at now next word
            }
            j++;
        }
        //for leetquestion reverse words in a string 2; 
        //reverse(str,0,str.length-1);
        return new String(str);
    }
}