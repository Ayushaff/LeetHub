class Solution {
    public String mergeAlternately(String w1, String w2) {
        //1pointers 
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < w1.length() || i < w2.length(); i++) {
            if (i < w1.length())
                res.append(w1.charAt(i));
            if (i < w2.length())
                res.append(w2.charAt(i));
        }
        return res.toString();
    }
}
    /* 
    //2pointers
public String mergeAlternately(String w1, String w2) {
    int n = w1.length(), m = w2.length();
    int i = 0, j = 0;
    StringBuilder res = new StringBuilder();
        while (i < n || j < m) {
            if (i < w1.length())
                res.append(w1.charAt(i++));
            if (j < w2.length())
                res.append(w2.charAt(j++));
        }
        return res.toString();
    }
    */
        
    /*  
    2pointers
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
}*/