// class Solution {
//     public int countDig(int n)  
// {  
// int count = 0;  
// while(n != 0)  
// {  
// // removing the last digit of the number n  
// n = n / 10;  
// // increasing count by 1  
// count = count + 1;  
// }  
// return count;  
// } */
//     public int countDigits(int num) {
//         int c=0;
//         int l=countDig(num);
//         for(;n>0;){
//             int j=num%10;
//             //System.out.println(j);
//             if(num%j==0){ 
//                 System.out.println(j);
//                 c++;
//             }
//             num/=10;
            
//         }
//         return c;
//     }
class Solution {
 public int countDigits(int num) {
    int ans=0;
     int n=num ;
     while(n>0){
         int x=n%10;
         if(num%x==0)
             ans++;
         n/=10;
     }
     return ans;
 }
}
