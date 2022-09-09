class Solution {
    
    
    //tc o(nlogn) sc O(1)
    public int numberOfWeakCharacters(int[][] properties) {
        
        Arrays.sort(properties,(a,b)->b[0]==a[0]?b[1]-a[1]:a[0]-b[0]);
        
        int ans=0 ,maxDefence=Integer.MIN_VALUE;
        for(int i=properties.length-1;i>=0;i--){
            if(properties[i][1]<maxDefence)
                ans++;
            maxDefence=Math.max(maxDefence,properties[i][1]);
        }
        return ans;
    }
}