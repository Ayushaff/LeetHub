import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int minimumLengthEncoding(String[] words) {
        if (words.length == 0)
            return 0;

        Set<String> set = new HashSet<>();
        int len = 0;

        for (String word : words) {
            set.add(word);
        }
        for (String word : words) {
            for (int i = 1; i < word.length(); i++) {
                String sub = word.substring(i);
                set.remove(sub);
            }
        }
        for (String word : set) {
            len += (word.length() + 1);
        }
        return len;
    }
    //1 all the strings in the set 
    //2 set: iterate each word one by find all possible substrings
    //and
    //3 check if sbstring is already present in set
    //4 if yes then remove it
}
