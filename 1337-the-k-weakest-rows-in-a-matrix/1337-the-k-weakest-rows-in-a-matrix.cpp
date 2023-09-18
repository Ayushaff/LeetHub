class Solution {
public:
    vector<int> kWeakestRows(vector<vector<int>>& m, int k) {
       priority_queue<pair<int, int>,vector<pair<int, int>>,greater<pair<int, int>>> minHeap;

        for (int i = 0; i < m.size(); i++) {
            int sc = 0;

            for (int j = 0; j < m[i].size(); j++) {
                if (m[i][j] == 1) {
                    sc++;
                }
            }

            minHeap.push({sc, i});
        }

        vector<int> weakestRows(k);
        for (int i = 0; i < k; i++) {
            weakestRows[i] = minHeap.top().second;
            minHeap.pop();
        }

        return weakestRows;        
    }
};