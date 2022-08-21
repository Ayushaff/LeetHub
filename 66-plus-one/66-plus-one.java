class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        
        for(int i=n-1;i>=0;i--)
        {
            if (digits[i] != 9) {
                digits[i]++;    //if not 9 just add +1;
                break;
            }
            else{
                digits[i]=0;    //if 9 add 0 at ith place
                
            }               
        }
        if(digits[0]==0){   //case 99999
            int res[] = new int[n+1];// space n=100 of length so, n+1 = 100+1 
            res[0]=1;
            return res;
        }
        return digits;
    }
}