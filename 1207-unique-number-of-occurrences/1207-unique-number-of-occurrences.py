class Solution:
    def uniqueOccurrences(self, arr: List[int]):
        #nums=Counter(arr).values()
        return len(Counter(arr).values())==len(set(Counter(arr).values()));
        
            