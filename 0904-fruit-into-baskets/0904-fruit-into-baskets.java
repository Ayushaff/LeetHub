 
        /*Initialize max_picked = 0 as the maximum fruits we can collect, and use hash map basket to record the types of fruits in the current window.

Start with an empty window having left = 0 and right = 0 as its left and right index.

We iterate over right and add fruits[right] to this window.

If there are no more than 2 types of fruits, this subarray is valid.
Otherwise, we need to keep removing fruits from the left side until there are only 2 types of fruits in the window.
Then we update max_picked as max(max_picked, right - left + 1).

Once we finish iterating, return max_picked as the maximum number of fruits we can collect.*/
        class Solution {
    public int totalFruit(int[] fruits) {
        // We use a hash map 'basket' to store the number of each type of fruit.
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0, maxPicked = 0;
        
        // Add fruit from the right index (right) of the window.
        for (int right = 0; right < fruits.length; ++right) {
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            // If the current window has more than 2 types of fruit,
            // we remove fruit from the left index (left) of the window,
            // until the window has only 2 types of fruit.
            while (basket.size() > 2) {
                basket.put(fruits[left], basket.get(fruits[left]) - 1);
                if (basket.get(fruits[left]) == 0)
                    basket.remove(fruits[left]);
                left++;
            }
            
            // Update maxPicked.
            maxPicked = Math.max(maxPicked, right - left + 1);
        }
        
        // Return maxPicked as the maximum number of fruits we can collect.
        return maxPicked;
    }
}
        
      /*  int i=0,j=0,n=fruits.length,mx=1;
        
        Map<Integer,Integer>hm=new HashMap<>();
        
        while(j<n)
        {
            int rightChar=fruits[j];
            hm.put(rightChar,hm.getOrDefault(rightChar,0)+1);
            
            if(hm.size()>2)
            {
                while(hm.size()>2)
                {
                  int leftChar=fruits[i];  
                  hm.put(leftChar,hm.get(leftChar)-1);
                    
                    if(hm.get(leftChar)==0)
                        hm.remove(leftChar);
                    i++;
                }                
            }
            if(hm.size()==2)
            {
                mx=Math.max(mx,j-i+1);
            }
            else if(hm.size()<2)
            {
                while(hm.size()>2)
                {
                  int leftChar=fruits[i];  
                  hm.put(leftChar,hm.getOrDefault(leftChar,0)-1);
                    
                    if(hm.get(leftChar)==0)
                        hm.remove(leftChar);
                    i++;
                }   
            }
            j++;
        }
        return mx;
    }
}*/
/*
class Solution {
    public int totalFruit(int[] fruits) {
        // We use a hash map 'basket' to store the number of each type of fruit.
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0, maxPicked = 0;
        
        // Add fruit from the right index (right) of the window.
        for (int right = 0; right < fruits.length; ++right) {
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            // If the current window has more than 2 types of fruit,
            // we remove fruit from the left index (left) of the window,
            // until the window has only 2 types of fruit.
            while (basket.size() > 2) {
                basket.put(fruits[left], basket.get(fruits[left]) - 1);
                if (basket.get(fruits[left]) == 0)
                    basket.remove(fruits[left]);
                left++;
            }
            
            // Update maxPicked.
            maxPicked = Math.max(maxPicked, right - left + 1);
        }
        
        // Return maxPicked as the maximum number of fruits we can collect.
        return maxPicked;
    }
}

Complexity Analysis
Let nn be the length of the input array fruits.

Time complexity: O(n)O(n)

Similarly, both indexes left and right are only monotonically increasing during the iteration, thus we have at most 2 \cdot n2⋅n steps,
At each step, we update the hash set by addition or deletion of one fruit, which takes constant time. Note that the number of additions or deletions does not exceed nn.
To sum up, the overall time complexity is O(n)O(n)
Space complexity: O(1)O(1)

We maintain the number of fruit types contained in the window in time. Therefore, at any given time, there are at most 3 types of fruits in the window or the hash map basket.
In summary, the space complexity is O(1)O(1).
*/