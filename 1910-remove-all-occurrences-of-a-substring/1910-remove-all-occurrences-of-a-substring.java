class Solution {
    public String removeOccurrences(String s, String part) {
        return s.contains(part) ? removeOccurrences(s.replaceFirst(part, ""), part) : s;
        }
    }
//2
/*
class Solution {
public:
    string removeOccurrences(string s, string part) {
           while(s.length()!=0&&s.find(part)<s.length()){
            s.erase(s.find(part),part.length());
        }
        return s;
    }
};*/