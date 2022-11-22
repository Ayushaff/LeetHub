class Solution {
    public String reverseOnlyLetters(String str) {
        char arr[]=str.toCharArray();
        int s=0,e=arr.length-1;
        while(s<e){
            if(!Character.isLetter(arr[s]))
                s++;
            else if(!Character.isLetter(arr[e]))
                e--;
            else//both are letters
            {
                char temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        return String.valueOf(arr);
    }
}
        /*
        Stack<Character> letters = new Stack();
        
        for (char c: S.toCharArray())
            if (Character.isLetter(c))
                letters.push(c);

        StringBuilder ans = new StringBuilder();
        for (char c: S.toCharArray()) {
            if (Character.isLetter(c))
                ans.append(letters.pop());
            else
                ans.append(c);
        }

        return ans.toString();
    }
}*/