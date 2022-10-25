class Solution {
public:
    bool arrayStringsAreEqual(vector<string>& w1, vector<string>& w2) {
            string s1=convertToStr(w1);
            string s2=convertToStr(w2);
            cout<<s1<<" "<<s2<<endl;
                if(s1.compare(s2)==0)
                        return true;
            return false;
    }
        string convertToStr(vector<string>v){
                string str;
                for(auto i:v)
                        str+=i;
                return str;
        }
};