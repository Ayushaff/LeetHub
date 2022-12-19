
        class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        if (temperatures == null) {
            throw new IllegalArgumentException("Input array is null");
        }

        int len = temperatures.length;
        int[] result = new int[len];
        if (len <= 1) {
            return result;
        }

        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }

        return result;
    }
        }
     /*   Stack<Integer>st=new Stack<>();
        int n=tempra.length;
        Vector<Integer> ans = new Vector<Integer>(n);
        

        for(int i=n;i>=0;i--){
            if(st.isEmpty()){
                st.push(i);
                ans.add(0);
            }
            else{
                while(!st.isEmpty() && tempra[st.peek()]<=tempra[i]){    //if top of stack is lesser than current elements it means not warmer day nearest we want right greaterest same to next greater element
                    st.pop();
                }
                if(st.isEmpty()){
                    st.push(i);
                    ans.add(0);
                }
                else{
                    ans.add(st.peek()-i);
                    st.push(i);
                }
            }
        }
        Collections.sort(ans);
         Object[] array
            = ans.toArray();
        return array;
    }
}*/