class Solution {
public:
    int addDigits(int num) {
        int n=0;
        int s=0;
        while(num>0){
        n=num%10;
        s+=n;
        num/=10;
        cout<<n<<endl;
        }
        cout<<s<<endl;
        if(s<10)return s;
        else return addDigits(s);
        
    }
};