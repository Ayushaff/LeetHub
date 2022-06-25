class Solution {
    //3
    public void reverse(char []arr,int s,int e){
        if (s >=e)
    return;
        char temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        reverse(arr,s+1,e-1);
    }
    public void reverseString(char[] s) {
        //1
       /* List<Character> vector = new ArrayList<>();
        for(int i=0;i<s.length;i++)vector.add(s[i]);
            Collections.swap(vector,0,s.length);
    }*/
       /* int ap=0;
        int bp=s.length-1;
        while(ap<bp){
            char temp=s[ap];
            s[ap]=s[bp];
            s[bp]=temp;
            ap++;
            bp--;*/
        
        Solution ss=new Solution();
        ss.reverse(s,0,s.length-1);
    }
}