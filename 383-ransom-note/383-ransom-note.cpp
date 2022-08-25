class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) 
    {
        //ransomeNote can be constructed from magazine if magazine contains all the letter used in making ransomeNote
        //1 freq hashmap
        unordered_map<char,int>map;
        
        //store all the char of magazine so that it can be searched easily
        for(auto mg:magazine){
            map[mg]++;
        }
        
        //iterate ransomeNote 
        for(auto ch:ransomNote)
        {
            if(!map[ch]--)
            {
                return false;
            }
        }
            return true;
    }
};
//         //2 freq array
//         int arr[26];    // find occurence of each character in string magazine
//         for(char mg: magazine)
//         {
//             arr[mg - 'a']++;
//         }
        
//         for(char ch:ransomNote)
//         {
//             if(arr[ch-'a']==0){   // character is not found in magazine or a particular character doesn't have equal or greater count than count in magazine
//                 return false;
//             }
//             else{
//                 arr[ch-'a']--;    // decrement if character exists        
//             }
//         }
//         return true;
//     }
// };