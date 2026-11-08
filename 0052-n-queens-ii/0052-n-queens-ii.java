class Solution {
    public int totalNQueens(int n) {
        boolean[] cols = new boolean[n];
        boolean[] leftDiags = new boolean[2 * n - 1];   // row - col
        boolean[] rightDiags = new boolean[2 * n - 1];  // row + col
        
        return backtrack(0, n, cols, leftDiags, rightDiags);
    }
    
    private int backtrack(int row, int n, boolean[] cols, boolean[] leftDiags, boolean[] rightDiags) {
        // Base case: If we successfully placed queens in all rows, we found 1 valid solution
        if (row == n) {
            return 1;
        }
        
        int count = 0;
        
        // Try placing a queen in each column of the current row
        for (int col = 0; col < n; col++) {
            int leftDiagIndex = row - col + n - 1;
            int rightDiagIndex = row + col;
            
            // Check if column or diagonals are already attacked
            if (cols[col] || leftDiags[leftDiagIndex] || rightDiags[rightDiagIndex]) {
                continue;
            }
            
            // Choose (Place queen)
            cols[col] = true;
            leftDiags[leftDiagIndex] = true;
            rightDiags[rightDiagIndex] = true;
            
            // Explore (Move to next row) and add to count
            count += backtrack(row + 1, n, cols, leftDiags, rightDiags);
            
            // Unchoose (Backtrack and reset state)
            cols[col] = false;
            leftDiags[leftDiagIndex] = false;
            rightDiags[rightDiagIndex] = false;
        }
        
        return count;
    }
}