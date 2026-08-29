class Solution {
    public int minCost(int n) {
        if (n == 1) return 0;
        return minCost(n-1) + n-1;
    }
}

