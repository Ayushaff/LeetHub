class Solution {
    public boolean arrayStringsAreEqual(String[] w1, String[] w2) {
        String s1=convert(w1);
        String s2=convert(w2);
           
            return s1.equals(s2);
    }
        String convert(String[] w){
                StringBuilder sb=new StringBuilder();
                for(String i:w)
                        sb.append(i);
         return sb.toString();  //convert sb to string       
        }
}