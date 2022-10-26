class Solution {
public:
    bool arrayStringsAreEqual(vector<string>& w1, vector<string>& w2) {
            //tc O(length of word1,l2) O(1)
            int i=0,j=0,a=0,b=0;
            
            while(i<w1.size() and j<w2.size()){
                    if(w1[i][a] != w2[j][b]) //word1 ith string and a is char of string 
                        return false;
                    a++,b++;
                    if(a>=w1[i].size())
                            i++,a=0;
                    if(b>=w2[j].size())
                            j++,b=0;
                    
                    
            }
            return i==w1.size() and j==w2.size();
    }
};
            
/*********
//output abc 
          for(int i=0;i<w1.size();){
                   cout<<w1[i][a++];    //i th string from array and a th index
                    if(a>=w1[i].size()) //if i string from array is done iterating of chars (of a th indexes)
                            i++,a=0;    //so next ith string++ and of that 0th index 
            }   
            
            
**********/
            
     
          /*
          //tc O(l1,l2) sc O(k)
          string s1=convertToStr(w1);
            string s2=convertToStr(w2);
            cout<<s1<<" "<<s2<<endl;
                if(s1.compare(s2)==0)
                        return true;
            return false;
    }
        string convertToStr(vector<string>v){
                string str;
                // for(auto i:v)
                //         str+=i;
                
                for(auto const &i :v)   //O(n)
                        str+=i;
                return str;
        }
        };
        */
 