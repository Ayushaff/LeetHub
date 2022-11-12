class Solution {
    public String mergeAlternately(String w1, String w2) {
        int l1=w1.length() ,l2=w2.length();
        int a=l1+l2;
        char[] res=new char[a];
        int p1=0,p2=0,resp=0;
        while(p1<l1 || p2<l2){
            if(p1<l1)
                res[resp++]=w1.charAt(p1++);
            if(p2<l2)
                res[resp++]=w2.charAt(p2++);
            
        }
        return new String(res);
    }
}