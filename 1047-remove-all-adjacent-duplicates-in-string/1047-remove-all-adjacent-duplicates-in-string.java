class Solution {
    public String removeDuplicates(String s) {
//method 2 Stack
Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.empty() && s.charAt(i)==st.peek())
                st.pop();
            else 
                st.add(s.charAt(i));                
        }
        StringBuilder sb=new StringBuilder();
        while(!st.empty())
        sb.append(st.pop());
        return sb.reverse().toString();
    }
}
    /*
//method 1 StringBuilder
       StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
                System.out.println("if");
                sb.deleteCharAt(sb.length() - 1);
            } else {
                System.out.println("else");
                sb.append(c);
            }
        }
        return sb.toString();
        }
        }
        */