class Solution {
public:
    int pivotInteger(int n) {
        int tmp=0;
        for(int i=1;i<=n;i++){
            tmp+=i;
        }
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
            if(sum==tmp)
                return i;
            tmp-=i;
        }
        return -1;
    }
};