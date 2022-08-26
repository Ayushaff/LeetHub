class Solution {
    public boolean reorderedPowerOf2(int n) 
    {
        int [] nFreq=digitFreq(n);
        
        for(int i=0;i<31;i++)
        {
            int powerOf2=(int)Math.pow(2,i);
            int [] powerOf2FreqCount = digitFreq(powerOf2);            
            if(compareFreq(nFreq,powerOf2FreqCount)) 
                return true;
            
        }
        return false;
    }
    
    private boolean compareFreq (int []nFreq ,int []powerOf2FreqCount){
        boolean match=true;
        for(int i=0;i<10;i++){
            if(nFreq[i]!=powerOf2FreqCount[i])
                return false;            
        }
        return true;
    }
    
    private int [] digitFreq(int num){
        int [] digitFreq=new int [10];
        while(num>0){
            digitFreq[num%10]++;    //first digit from num (from right) of digit
            num /= 10;
        }
        return digitFreq;
    }
}