class Solution {
public:
    bool increasingTriplet(vector<int>& n) {
/*            int f=INT_MAX,s=INT_MAX;
            
            for(auto x:n){
                    if(x<f)
                            f=x;
                    else if(f<x && x<s)
                            s=x;
                    else if(x>s)
                            return true;
            }
            return false;
    }
};*/
        vector<int> v(2,INT_MAX);
        
        for(int i=0;i<n.size();i++){
            if(n[i]<=v[0]) v[0]=n[i];
                
            else if(n[i]<=v[1]) v[1]=n[i];
                
            else if(n[i]>v[1])return true;
        }
        return false;
    }
};