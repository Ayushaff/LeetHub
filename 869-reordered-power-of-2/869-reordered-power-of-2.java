class Solution { 
    /*TC : Calculating the frequency Count for a no would be O(no of digits in N). Also,there could a case where it matches with 2^31 (last power of 2).So the complexity would be O(32*length(2^32) + O(no of digits in N)*/
    public boolean reorderedPowerOf2(int n) 
    {
		int [] nFreq=digitFreq(n);
        
        for(int i=0;i<31;i++) //Within the integer range max power of 2 that lies is 2^31
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
            digitFreq[num%10]++;    //counting freq for each digit so here we extracted the last digit from number ( from right side )
            num /= 10; 
        }
        return digitFreq;
    }
}