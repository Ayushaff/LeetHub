class Solution {
    public int characterReplacement(String s, int k) {
        int ss=0 ,maxLen=0 ,maxcountOfRepeatingCharacter=0;
            Map<Character,Integer>map =new HashMap<>();
            
            for(int e=0;e< s.length();e++)
            {
                    char rightChar=s.charAt(e);
                    map.put(rightChar,map.getOrDefault(rightChar,0)+1);
                    
                    maxcountOfRepeatingCharacter=Math.max(maxcountOfRepeatingCharacter,map.get(rightChar));
                    
                    //window size e-s+1
                    
                    //remainig letter are more than k
                    if(e-ss+1- maxcountOfRepeatingCharacter >k){
                            char leftChar=s.charAt(ss);
                            map.put(leftChar,map.get(leftChar)-1);
                            ss++;
                    }
                    maxLen=Math.max(maxLen,e-ss+1);
            }
            return maxLen;
    }
}