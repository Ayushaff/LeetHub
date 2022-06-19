import java.util.*;  
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res= new int[num_people];  
        int candCount=1;
        int idx=0;
        while(candies>0){
            res[idx++]+=candCount;
            candies-=candCount;
            candCount++;
            if(idx%num_people<=0)idx=0;
            if(candCount>candies)candCount=candies;
        }
        return res;
    }
}