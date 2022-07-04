class Solution {
    public int candy(int[] ratings) {
        //distribute every student 1 candu
        //check ranks of neighbour child first 
        int size=ratings.length;
        int []distribution=new int[ratings.length];
        int total=0;
        
        Arrays.fill(distribution,1);
        
        //check from left to right whose immediate negbouring ratings(i+1) more than current element(i)
        for(int i=0;i<size-1;i++){
            if(ratings[i+1]>ratings[i]){
                distribution[i+1]=distribution[i]+1; //update value at i+1 index of distribution array
            }
        }
        
    //reverse direction checking 
        //now check from right-left whose ratings is more than current than again increments 

        for(int i=size-1 ;i>0 ;i--){
            if(ratings[i-1]>ratings[i]){
                if(distribution[i-1]<=distribution[i])
                distribution[i-1]=distribution[i]+1;
            }
        }
        for(int i=0;i<ratings.length;i++){
            total+=distribution[i];
        }
        return total;
    }
}