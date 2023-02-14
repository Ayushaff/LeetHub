 class Solution {
    public String addBinary(String a, String b) {
        int alen=a.length(), blen=b.length() ,i=0,carry=0;
            String res="";
            
            while(i<alen || i<blen || carry!=0){
                    int x=0;
                    if(i<alen && a.charAt(alen-1-i)=='1')x=1;
                    int y=0;
                    if(i<blen && b.charAt(blen-1-i)=='1')y=1;
                    
                    res=(x+y+carry)%2+res;
                    carry=(x+y+carry)/2;
                    i++;
            }
            return res;
    }
}