class Solution {
public:
    int reverse(int x) {
       int ans=0;
        
        while(x!=0){ 
            //123
            int digit=x%10; 
            //digit = 3 ,2, 1
            
            if( (ans>INT_MAX/10) || (ans<INT_MIN/10) ){
                return 0;
            }
            
            ans=(ans*10)+digit;
            // ans = 3 , ans = 32 , ans =321
            
            x/= 10; 
            //x = 12 , 1 , 0
            
        }
        return ans;
    }
};