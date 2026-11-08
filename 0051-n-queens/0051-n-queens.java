
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        
        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        // Track columns and diagonals
        boolean[] cols = new boolean[n];
        boolean[] leftDiags = new boolean[2 * n - 1];   // row - col
        boolean[] rightDiags = new boolean[2 * n - 1];  // row + col
        
        backtrack(0, n, board, cols, leftDiags, rightDiags, result);
        return result;
    }
    
    private void backtrack(int row, int n, char[][] board, 
                           boolean[] cols, boolean[] leftDiags, boolean[] rightDiags, 
                           List<List<String>> result) {
        // Base case: If all queens are placed, add the board configuration to results
        if (row == n) {
            result.add(construct(board));
            return;
        }
        
        // Try placing a queen in each column of the current row
        for (int col = 0; col < n; col++) {
            int leftDiagIndex = row - col + n - 1;
            int rightDiagIndex = row + col;
            
            // Check if column or diagonals are already under attack
            if (cols[col] || leftDiags[leftDiagIndex] || rightDiags[rightDiagIndex]) {
                continue;
            }
            
            // Place the queen (Choose)
            board[row][col] = 'Q';
            cols[col] = true;
            leftDiags[leftDiagIndex] = true;
            rightDiags[rightDiagIndex] = true;
            
            // Recurse to the next row (Explore)
            backtrack(row + 1, n, board, cols, leftDiags, rightDiags, result);
            
            // Remove the queen and reset state (Unchoose / Backtrack)
            board[row][col] = '.';
            cols[col] = false;
            leftDiags[leftDiagIndex] = false;
            rightDiags[rightDiagIndex] = false;
        }
    }
    
    private List<String> construct(char[][] board) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            list.add(new String(board[i]));
        }
        return list;
    }
}