class Solution {
    public String makeGood(String s) {
        Stack<Character>st=new Stack<>();
        
        //iterate over s
        for(char currChar: s.toCharArray()){
            // If the current character make a pair with the last character in the stack,
            // remove both of them. Otherwise, we the add current character to stack.
            if(!st.isEmpty() && Math.abs(st.lastElement()-currChar)==32)
                st.pop();
            else
                st.add(currChar);
        }
           // Returns the string concatenated by all characters left in the stack.
        StringBuilder ans=new StringBuilder();
       /* for(char currChar:st.getLast() )
            ans.append(currChar);
        */
         for (char currChar:st)
            ans.append(currChar);
        return ans.toString();
    }
}