class Solution
{
private:
    bool checkEqual(int a[26], int b[26])
    {
        for (int i = 0; i < 26; i++)
        {
            if (a[i] != b[i])
                return 0;
        }
        return 1;
    }
    public:
    bool checkInclusion(string s1, string s2)
    {

        // count array for occurences of characters in string s1
        int count1[26] = {0};

        for (int i = 0; i < s1.length(); i++)
        {
            int index = s1[i] - 'a';
            count1[index]++;
        }
        // traverse s2 string in window of size s1 length and compare
        int i=0;
        int windowSize = s1.length();
        int count2[26] = {0};
        // running for first window
         
        while(i < windowSize && i < s2.length())
        {
            int index = s2[i] - 'a';
            count2[index]++;
            i++;
        }
        if (checkEqual(count1, count2))
            return 1;
        // aage ki windows procced karo
        while (i < s2.length())
        {
            char newChar = s2[i];
            int index = newChar - 'a';
            count2[index]++;

            char oldChar = s2[i - windowSize];
            index = oldChar - 'a';
            count2[index]--;
            i++;
            // compare agaain n agen
            if (checkEqual(count1, count2))
                return 1;
        }
        return 0;
    }
};
    
    //2
  /*  bool checkInclusion(string s1, string s2) {
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);
        
        vector<int> s1hash(26,0);
        vector<int> s2hash(26,0);
        int s1len = s1.size();
        int s2len = s2.size();
        if(s1len>s2len)
            return false;
        
        int left=0,right=0;
        while(right<s1len)
        {
            s1hash[s1[right]-'a'] +=1;
            s2hash[s2[right]-'a'] +=1;
            right +=1;
        }
        right -=1;  // to point right to the end of the window
        while(right<s2len)
        {
            if(s1hash==s2hash)
                return true;
            right+=1;
            if(right!=s2len)
                s2hash[s2[right]-'a'] +=1;
            s2hash[s2[left]-'a'] -=1;
            left +=1;
        }
        return false;
    }
};
*/