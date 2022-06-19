#include<string>
#include<iostream>
#include<vector>
class Solution {
   /* bool isPalindrome(string s) {
       int j=0;
        for(int i=0,j=s.size()-1;i<j;i++,j--){//2pointers movings unless they collide
            while(isalnum(s[i])==false&&i<j)i++;//Leftpointer increment if not alnumeric
            while(isalnum(s[j])==false&&i<j)j--;//  Rigthpointer increment if not alnumeric
            if(toupper(s[i])!=toupper(s[j])) return false;           
        }
        return true;
    }
*/
    
private:
    bool valid(char ch) {
        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
            return 1;
        }
        
        return 0;
    }
    
    char toLowerCase(char ch) {
    if( (ch >='a' && ch <='z') || (ch >='0' && ch <='9') )
        return ch;
    else{
        char temp = ch - 'A' + 'a';
        return temp;
    }
}
    bool checkPalindrome(string a) {
    int s = 0;
    int e = a.length()-1;

    while(s<=e) {
        if(a[s] != a[e])
        {
            return 0;       
        }
        else{
            s++;
            e--;
        }
    }
    return 1;
}
public:
    bool isPalindrome(string s) {
        
        //faltu character hatado
        string temp = "";
        
        for(int j=0; j<s.length(); j++) {   
            if(valid(s[j])) {
                temp.push_back(s[j]);
            }
        }
        
        //lowercase me kardo
        for(int j=0; j<temp.length(); j++) { 
            temp[j] = toLowerCase(temp[j]);
        }
        
        //check palindrome
        return checkPalindrome(temp);
        
    }
};