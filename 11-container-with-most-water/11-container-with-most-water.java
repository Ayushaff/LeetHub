class Solution {
    public int maxArea(int[] h) {
        
        int i=0,j=h.length-1, ans=0;
        while(i<=j){
            ans=Math.max( Math.min(h[i],h[j]) *(j-i) ,ans);
            
            if(h[i]<h[j])i++;
                else j--; 
        }
   return ans;
        /*int i=0;
        int j=height.length-1;
        int ans=0;
        
        while(i<j){
            if(height[i]<height[j]){
                ans=Math.max(ans,height[i]*(j-i));
                i++;
            }
            else{
                ans=Math.max(ans,height[j]*(j-i));
                j--;
            }
        }
        return ans;*/
    }
}