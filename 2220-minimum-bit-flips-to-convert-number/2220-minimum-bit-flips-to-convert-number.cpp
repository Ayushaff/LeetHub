class Solution {
public:
    int countSetBits(int n)
{
     int count = 0;
    while (n > 0) {
        count++;
        n &= (n - 1);
    }
    return count;
}
    int minBitFlips(int a, int b) {
        return countSetBits(a ^ b);
    }
};