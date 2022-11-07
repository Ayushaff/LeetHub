class Solution {
    public int maximum69Number (int num) {
        //convert num to stringBuilder
        StringBuilder numSb=new StringBuilder();
        numSb.append(num);
        
    for(int i=0;i<numSb.length();i++){
        if(numSb.charAt(i)=='6'){
            numSb.setCharAt(i,'9');
            return Integer.parseInt(numSb.toString());
        }
    }
        return num;
    }
}