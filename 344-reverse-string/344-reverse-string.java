class Solution {
    public void reverseString(char[] s) {
       /* List<Character> vector = new ArrayList<>();
        for(int i=0;i<s.length;i++)vector.add(s[i]);
            Collections.swap(vector,0,s.length);
    }*/
        int ap=0;
        int bp=s.length-1;
        while(ap<bp){
            char temp=s[ap];
            s[ap]=s[bp];
            s[bp]=temp;
            ap++;
            bp--;
        }
    }
}