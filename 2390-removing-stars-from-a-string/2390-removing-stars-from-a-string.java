class Solution {
    public String removeStars(String s) {
          int j=0;
            char arr[]=s.toCharArray();
            for(int i=0;i<arr.length;i++){
                    if(arr[i]=='*')
                            j--;
                    else
                            arr[j++]=arr[i];
            }
            return String.valueOf(arr).substring(0,j);
    }
}
          /*  Stack<Character>st=new Stack<>();
                for(int i=0;i<s.length();i++)
                {
                  if(s.charAt(i)!='*'){
                        st.push(s.charAt(i));
                          continue;
                    }else
                        {
                          st.pop();
                  }                  
                }
            if(st.isEmpty())return "";
            
            StringBuilder sb=new StringBuilder();
            while(!st.isEmpty()){
                    sb.append(st.pop());
            }
            return sb.reverse().toString();
    }
}*/