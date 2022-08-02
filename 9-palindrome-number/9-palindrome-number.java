class Solution {
    public boolean isPalindrome(int x) {
        int xx=x;
        if(x==0) return true;
        else if(x<0) return false;
        
        int rem=0;
        int rev=0;
        while(x!=0){
            
            rem=x%10;   //got last digit of x i.e 2 
            x=x/10;         //last digit gone ie. 21
            rev=rev *10 +rem;
            System.out.println(rem);
        }
        if(rev==xx) return true;
        else return false;
    }
}