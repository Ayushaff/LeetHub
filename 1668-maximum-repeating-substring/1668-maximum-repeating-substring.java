class Solution {
    public int maxRepeating(String sequence, String word) {
        int a=0;
        StringBuilder find=new StringBuilder(word);
            while(sequence.contains(find)){
                find.append(word);
                a++;                
            }
        return a;
    }
}