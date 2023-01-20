class Solution {
    public int maximumValue(String[] strs) {
        int maxo=0;
            for(String s:strs){
                    boolean flag=false;
                    for(int i=0;i<s.length();i++){
                            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                                    flag=true;
                                    
                            break;
                            }
                    }
                    if(flag==true)
                            maxo=Math.max(maxo,(int)s.length());
                    else
                            maxo=Math.max(maxo,Integer.parseInt(s));
            }
            return maxo;
    }
}