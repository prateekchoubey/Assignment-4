class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int maxRow = m;
        int maxCol = n;
        
        for (int i = 0; i < ops.length; i++) {
            maxRow = Math.min(maxRow, ops[i][0]);
            maxCol = Math.min(maxCol, ops[i][1]);
        }
        
        return maxRow * maxCol;
    }
}
