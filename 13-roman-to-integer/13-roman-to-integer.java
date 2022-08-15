class Solution {
    public int romanToInt(String s) {
               TreeMap< Character,Integer>mp=new TreeMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
        
        //res value is having value that corresponds to the last value of string
        int res = mp.get(s.charAt(s.length()-1));
        
        //iterate over string starting from 2nd last character
        for(int i=s.length() -2 ;i>=0;i--){
            //compare the values for character at ith position 
            if(mp.get(s.charAt(i)) < mp.get(s.charAt(i+1))){
                //if value of i < i+1 subtraction 
                res -= mp.get(s.charAt(i));
            }
            else {
                res += mp.get(s.charAt(i));
            }            
        }
        return res;
    }
}