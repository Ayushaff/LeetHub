class Solution {
public:
    int compress(vector<char>& chars) {
        chars.push_back('~');
            vector<char>ans;
            int n=chars.size();
            int total=1;
            
            for(int i=1;i<n;i++){
                    
                    //if same as prev
                    if(chars[i]==chars[i-1])
                            total++;
                    
                    else{       
                            //prev not same + group ends
                            if(total<2)
                            {
                               //else if single char only 
                              //add prev from last group 
                            ans.push_back(chars[i-1]);
                            total=1;
                            }
                            
                            else
                            {
                                    //total is more than 1
                                ans.push_back(chars[i-1]);
                                    string str_len=to_string(total); //int to string
                                    //i.e if total is 25 so ,converted to "25" now convert this into different characters "2" "5"
                                    
                                    for(char i:str_len)
                                            ans.push_back((char)i);
                                    total=1;
                            }
                                    
                    }
            }
            chars=ans;
            return ans.size();
    }
};